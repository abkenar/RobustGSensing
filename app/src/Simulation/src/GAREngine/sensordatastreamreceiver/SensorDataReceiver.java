/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GAREngine.sensordatastreamreceiver;

import Classifier.FeatureExtractor;
import Classifier.TableTennisClassifierNew;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import sensoratagenerator.Sensors.Accelerometer;
import sensoratagenerator.Sensors.HeartRate;
import sensordatagenerator.RawRandomGenerator.GlobaModelHelper;
import sensordatagenerator.RawRandomGenerator.RawRandomGenerator;
import sensordatagenerator.Utils.DateTime;

/**
 *
 * @author DELL
 */
public class SensorDataReceiver extends Thread {

    int classifierExecutionInterval = 2; //sec
    public long lastTransmission = 0;
    FeatureExtractor extractor = new FeatureExtractor();
    List<Accelerometer> simulatedAccSensorArray;
    List<Double[]> lastTsecondsData;
    TreeMap<String, List<HeartRate>> hrData;

    @Override
    public void run() {
        super.run(); //To change body of generated methods, choose Tools | Templates.

        boolean running = true;
        int cnt = 1;

        while (true) {

            //thread get invoked after 10 seconds of application start time 
            if (System.currentTimeMillis() - GlobaModelHelper.getInstance().getApplicationStartTime() > 10000) {

                long timestamp = System.currentTimeMillis();
                hrData = GlobaModelHelper.getInstance().getGeneratedHRDataAll();
                
                try { 
                    TreeMap<String, List<HeartRate>> lastTsecHRData =  extractLastSecondsHRData(hrData,5);
                    System.out.println("sdgfgf");
                } catch (ParseException ex) {
                    Logger.getLogger(SensorDataReceiver.class.getName()).log(Level.SEVERE, null, ex);
                }

                //retrieve last n sec of hr data
                try {

                    if (RawRandomGenerator.generateAccelerometerData.size() > 200) {

                        if (timestamp - lastTransmission > classifierExecutionInterval * 1000) {
                            lastTransmission = timestamp;
                            simulatedAccSensorArray = GlobaModelHelper.getInstance().getSimulatedAccSensorArray();

                            //System.out.println( cnt++ +  " starting classification " + "Size of Received Data: " + extractLastSecondsData(simulatedAccSensorArray, 2).size() );
                            Double[] features = extractor.extractFeatures(extractLastSecondsData(simulatedAccSensorArray, 2));
                            int pace = (int) Math.round(TableTennisClassifierNew.classify(features));
                            System.out.println(pace);
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }

                //running = false;
                //System.out.println("++++++++++++++++++++++++ End of Thread ++++++++++++++++++++++");
            }
        }

    }

    public List<Double[]> extractLastSecondsData(List<Accelerometer> allReceived, int second) {

        lastTsecondsData = new ArrayList<Double[]>();
        for (int i = 0; i < second * 100; i++) {
            //fetch last t seconds (depends on frequency)
            Accelerometer acc = allReceived.get(allReceived.size() - second * 100 + i);
            Double[] d = {acc.getX(), acc.getY(), acc.getZ()};

            //System.out.println(allReceived.size() - second * 100 + i);
            lastTsecondsData.add(d);
        }

        //System.err.println("******************");
        return lastTsecondsData;

    }

    public TreeMap<String, List<HeartRate>> extractLastSecondsHRData(TreeMap<String, List<HeartRate>> allReceivedHR, int second) throws ParseException {

        TreeMap<String, List<HeartRate>> lastTsecondsData = new TreeMap<String, List<HeartRate>>();
        List<String> keys = new ArrayList<String>();
        List<HeartRate> tempHR;
        Iterator it = allReceivedHR.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            //System.out.println(pair.getKey() + " = " + pair.getValue());
            keys.add((String) pair.getKey());
            //it.remove(); // avoids a ConcurrentModificationException
        }

        // this loop iterates all the elemnent of keys (for different individuals) and extracts only last T seconds 
        for (int i = 0; i < keys.size(); i++) {

            //each tempHR belongs to one individual 
            tempHR = allReceivedHR.get(keys.get(i));
            //get last timestamp of each individual 
            long lastTimeStamp = tempHR.get(tempHR.size() - 1).getTimeStamp();

            if (tempHR.size() > 0) {

                for (int j = tempHR.size()-1; j >0 ; j--) {
                    if (DateTime.getSecDifference(tempHR.get(j).getTimeStamp(), lastTimeStamp) < second) {

                        if (!lastTsecondsData.containsKey(keys.get(i))) {
                            lastTsecondsData.put(keys.get(i), new ArrayList<HeartRate>());
                        }
                        lastTsecondsData.get(keys.get(i)).add(tempHR.get(j));

                    } 

                }

            }

        }

        return lastTsecondsData;

    }

}
