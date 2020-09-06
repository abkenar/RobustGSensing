package com.deakin.robustgsensing.groupsense.atomicclassifier;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Environment;
import android.util.Log;
import android.widget.TextView;

import com.deakin.robustgsensing.groupsense.ActivityHolder;
import com.deakin.robustgsensing.groupsense.GAR;
import com.deakin.robustgsensing.groupsense.Globals;
import com.deakin.robustgsensing.groupsense.constants.Constants;
import com.deakin.robustgsensing.groupsense.log.Mylogger;
import com.deakin.robustgsensing.groupsense.utils.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReasoningSensorListener implements SensorEventListener {

	String filename = "";
	long nanoBaseTime = 0;
	long utcBaseTime = 0;
	FileWriter gpxwriter = null;
	TextView label;
	FeatureExtractor extractor = new FeatureExtractor();
	String[] rootClasses = { "Inactive", "Active" };
	String[] activeClasses = { "Walking", "Running", "Cycling" };
	String[] inactiveClasses = { "Stationary", "OnMovingVehicle" };
	List<Double[]> buffer = new ArrayList<Double[]>();
	String activity = "";

	// Holds performed person activity to filter un-intentioned changes
	List<String> ActivityHistory = new ArrayList<String>();

	ActivityHolder ah;

	public String currentActivity;

	public ReasoningSensorListener(String n, TextView l) {
		filename = n;
		label = l;

		File root = Environment.getExternalStorageDirectory();
		if (root.canWrite()) {
			File gpxfile = new File(root, filename);
			try {
				gpxwriter = new FileWriter(gpxfile, true);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public void onAccuracyChanged(Sensor sensor, int accuracy) {
		// TODO Auto-generated method stub
	}

	private void writeData(long timestamp, Number[] data) {
		try {
			// if (ReasoningActivityActivity.label.compareTo("nothing")==0)
			// return;
			if (gpxwriter != null) {
				gpxwriter.write("\n" + timestamp + ",");
				for (int i = 0; i < data.length; i++) {
					gpxwriter.write(data[i] + ",");
				}
				gpxwriter.write("" + GAR.bLabel);
				// gpxwriter.write(ReasoningActivityActivity.label+"\n");
				gpxwriter.flush();
				// System.out.println("DATA at timestamp: "+timestamp);

			} else {
				System.out.println("FILEWRITER IS NULL");
			}
		} catch (IOException e) {
			Log.e("ANDROID", "Could not write file " + e.getMessage());
		}
	}

	long activityCount = 0;

	/*
	 * @Override public void onSensorChanged(SensorEvent event) { // TODO
	 * Auto-generated method stub long timestamp=System.currentTimeMillis();
	 * Number[] d={event.values[0],event.values[1],event.values[2]};
	 * writeData(timestamp,d); }
	 */
	public long lastTransmission = 0;
	public int count = 0;
	String first = DateTime.getCurrentTime();

	public void onSensorChanged(SensorEvent event) {

		count++;
		Globals.getInstance().setMyAtomicActivity("Inactive");
		// TODO Auto-generated method stub
		long timestamp = System.currentTimeMillis();

		Double[] d = { Double.valueOf(event.values[0]),
				Double.valueOf(event.values[1]),
				Double.valueOf(event.values[2]) };
		buffer.add(d);

		int bufferSize = buffer.size();

		// Sometime buffer size gets more than 200
		if (buffer.size() > 200) {
			Mylogger.writeDataForDetectedGroupActivities(
					"err at " + DateTime.getCurrentTime(), "err.csv");
			for (int j = 0; j < buffer.size() - 200; j++)
				buffer.remove(j);
		}

		// Every 2 Second received data in size of 200 is sent to the classifier
		if (buffer.size() == 200) {

			String second = DateTime.getCurrentTime();
			int a = count;

			// every 2 second one detected activity is sent to UI / or Group
			// activity detector
			if (timestamp - lastTransmission > Constants.ACTIVITY_DETECTION_INTERVAL) { // default
																						// value
																						// is
																						// 2
																						// sec
				lastTransmission = timestamp;
				try {
					Double[] features = extractor.extractFeatures(buffer);
					int activeOrNot = (int) Math.round(ActiveInactiveClassifier
							.classify(features));

					int walkingCounter = 0;
					int runningCounter = 0;
					int cyclingCounter = 0;
					int inactiveCounter = 0;

					if (activeOrNot == 0) {
						/*
						 * int whichActivity=(int)
						 * Math.round(InactiveClassifier.classify(features));
						 * label.setText("User is: " +
						 * rootClasses[activeOrNot]+" and is "
						 * +inactiveClasses[whichActivity]);
						 */
						// buffer.clear();
						label.setText("User is inactive at " + timestamp + "  "
								+ String.valueOf(buffer.size()));
						ActivityHistory.add("Inactive");

						Mylogger.writeDataForDetectedGroupActivities(
								"inactive at " + DateTime.getCurrentTime(),
								"test.csv");

					} else { // Active

						Mylogger.writeDataForDetectedGroupActivities(
								"active at " + DateTime.getCurrentTime(),
								"test.csv");

						int whichActivity = (int) Math.round(ActiveClassifier
								.classify(features));
						label.setText("User is: " + rootClasses[activeOrNot]
								+ " and is " + activeClasses[whichActivity]
								+ " at " + timestamp + "  "
								+ String.valueOf(buffer.size()));
						ActivityHistory.add(activeClasses[whichActivity]);

						activity = activeClasses[whichActivity];

					}

					//

					if (ActivityHistory.size() == 3
							&& !Globals.getInstance().isSimMode()) {
						for (int i = 0; i < 3; i++) {
							if (ActivityHistory.get(i).equalsIgnoreCase(
									"Walking"))
								walkingCounter++;
							if (ActivityHistory.get(i).equalsIgnoreCase(
									"Running"))
								runningCounter++;
							if (ActivityHistory.get(i).equalsIgnoreCase(
									"Cycling"))
								cyclingCounter++;
							if (ActivityHistory.get(i).equalsIgnoreCase(
									"Inactive"))
								inactiveCounter++;
						}
						if (walkingCounter > 1) {

							doSetReadyToSend("Walking");
						}
						if (runningCounter > 1) {
							doSetReadyToSend("Running");
						}

						if (cyclingCounter > 1) {
							doSetReadyToSend("Cycling");
						}

						if (inactiveCounter > 1) {
							doSetReadyToSend("Inactive");
						}

						// Write into a file (log)
						Mylogger.writeDataForDetectedGroupActivities(
								Globals.getInstance().getMyAtomicActivity()
										+ " at "
										+ Globals.getInstance()
												.getClassfierTimeStamp(),
								"classfier.csv");

						for (int j = 0; j < 2; j++)
							ActivityHistory.remove(j);
					}

					if (ActivityHistory.size() > 3)
						Mylogger.writeDataForDetectedGroupActivities(
								"Greater than 3", "classfier.csv");

				}

				catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				// clears a number of first elements from the buffer for more
				// reliable atomic activity detection

			}

			// buffer.remove(0);

			for (int i = 0; i < 60; i++) {
				buffer.remove(i);

			}

		}

	} // end onSensorChanged

	public void doSetReadyToSend(String activity) {
		Globals.getInstance().setMyAtomicActivity(activity);
		Globals.getInstance().setReadyToSend(true);
		Globals.getInstance().setClassifierTimeStamp(DateTime.getCurrentTime());
	}

	public void enableGPS() {
		// LocationManager mlocManager = (LocationManager)
		// getSystemService(Context.LOCATION_SERVICE);
	}

}