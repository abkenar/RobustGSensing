/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classifier;

import java.util.ArrayList;
import java.util.List;
import sensordatagenerator.Utils.DateTime;
import sensordatagenerator.RawRandomGenerator.GlobaModelHelper;
import sensordatagenerator.RawRandomGenerator.RawRandomGenerator;
import sensoratagenerator.Sensors.Accelerometer;


/**
 *
 * @author abakhshandehabk
 */
public class ClassiferThread extends Thread {

    int classifierExecutionInterval = 2; //sec
    public long lastTransmission = 0;
    FeatureExtractor extractor = new FeatureExtractor();
    List<Accelerometer> simulatedAccSensorArray;
    List<Double[]> lastTsecondsData ;

    @Override
    public void run() {
        super.run(); //To change body of generated methods, choose Tools | Templates.

        boolean running = true;
        int cnt = 1;
        while (!GlobaModelHelper.getInstance().isDataGeneratedFinished()) {

            long timestamp = System.currentTimeMillis();

            //runs every classifierExecutionInterval seconds
            //System.out.println("Simulated :" + simulatedAccSensorArray.size());
            try {

                if (RawRandomGenerator.generateAccelerometerData.size() > 200) {

                    if (timestamp - lastTransmission > classifierExecutionInterval * 1000) {
                        lastTransmission = timestamp;
                        simulatedAccSensorArray = GlobaModelHelper.getInstance().getSimulatedAccSensorArray();
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

    public List<Double[]> extractLastSecondsData(List<Accelerometer> allReceived, int second) {

        lastTsecondsData = new ArrayList<Double[]>();
        for (int i = 0; i < second * 100; i++) {
            //fetch last t seconds (depends on frequency)
            Accelerometer acc = allReceived.get(allReceived.size() - second * 100 + i);
            Double[] d = {acc.getX(), acc.getY(), acc.getZ()};
            
            //System.out.println(allReceived.size() - second * 100 + i);

            lastTsecondsData.add(d);
        }
        
        return lastTsecondsData;

    }
}


