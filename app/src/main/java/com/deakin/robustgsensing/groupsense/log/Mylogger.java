package com.deakin.robustgsensing.groupsense.log;

import android.os.Environment;
import android.util.Log;

import com.deakin.robustgsensing.groupsense.Globals;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Mylogger {

	public static void writeDataForDetectedGroupActivities(String msg, String filename) {
		try {
			File root = Environment.getExternalStorageDirectory();
			if (root.canWrite()) {
				File gpxfile = new File(root, filename);
				FileWriter gpxwriter = new FileWriter(gpxfile, true);
				gpxwriter.write(msg);
				gpxwriter.write("\n");
				gpxwriter.flush();
				gpxwriter.close();
			}
		} catch (IOException e) {
			Log.e("ANDROID", "Could not write file " + e.getMessage());
		}
	}
	
	
	public static void writeDataForLocationRetrieval(String type, String data) {
		try {

			Calendar c = Calendar.getInstance();
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String formattedDate = df.format(c.getTime());
			File root = Environment.getExternalStorageDirectory();
			if (root.canWrite()) {
				File gpxfile = new File(root, Globals.getInstance()
						.getDeviceName() + "location.csv");
				FileWriter gpxwriter = new FileWriter(gpxfile, true);
				gpxwriter.write(formattedDate + "," + type + "," + data);
				gpxwriter.write("\n");
				gpxwriter.flush();
				gpxwriter.close();
			}
		} catch (IOException e) {
			Log.e("BT", "Could not write file " + e.getMessage());
		}
	}
	
}
