/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sensordatagenerator.RawRandomGenerator;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import sensoratagenerator.Context.GPS;
import sensoratagenerator.Sensors.Accelerometer;
import sensoratagenerator.Sensors.HeartRate;
import sensordatagenerator.Model.Individual;

/**
 *
 * @author abakhshandehabk
 */
public class GlobaModelHelper {

    private static GlobaModelHelper instance;
    private static boolean dataGeneratedFinished;
    private List<Accelerometer> simulatedAccSensorArray;
    private static long applicationStartTime;

    //holds all the acc sensor data from all individuals .
    public static TreeMap<String, List<Accelerometer>> generatedAccelerometerDataAll = new TreeMap<String, List<Accelerometer>>();
    
    //holds all the GPS sensor data from all individuals .
    public static TreeMap<String, List<GPS>> generatedGPSDataAll = new TreeMap<String, List<GPS>>();

    public static TreeMap<String, List<HeartRate>> generatedHRDataAll = new TreeMap<String, List<HeartRate>>();
    

    public void setDataGeneratedFinished(boolean dataGeneratedFinished) {
        GlobaModelHelper.dataGeneratedFinished = dataGeneratedFinished;
    }

    public boolean isDataGeneratedFinished() {
        return dataGeneratedFinished;
    }

    public List<Accelerometer> getSimulatedAccSensorArray() {
        return simulatedAccSensorArray;
    }

    public void setSimulatedAccSensor(List<Accelerometer> simulatedAccSensorArray) {
        this.simulatedAccSensorArray = simulatedAccSensorArray;
    }

    public void addSimulatedAccSensor(Accelerometer simulatedAccSensor) {

        if (simulatedAccSensorArray == null) {
            simulatedAccSensorArray = new ArrayList<Accelerometer>();
        }

        this.simulatedAccSensorArray.add(simulatedAccSensor);
    }

    public static synchronized GlobaModelHelper getInstance() {
        if (instance == null) {
            instance = new GlobaModelHelper();
        }
        return instance;
    }

    public  TreeMap<String, List<Accelerometer>> getGenerateAccelerometerDataAll() {
        return generatedAccelerometerDataAll;
    }

    public  void setGenerateAccelerometerDataAll(TreeMap<String, List<Accelerometer>> generateAccelerometerDataAll) {
        GlobaModelHelper.generatedAccelerometerDataAll = generateAccelerometerDataAll;
    }

    public  TreeMap<String, List<GPS>> getGeneratedGPSDataAll() {
        return generatedGPSDataAll;
    }

    public  void setGeneratedGPSDataAll(TreeMap<String, List<GPS>> generatedGPSDataAll) {
        GlobaModelHelper.generatedGPSDataAll = generatedGPSDataAll;
    }

    public  TreeMap<String, List<HeartRate>> getGeneratedHRDataAll() {
        return generatedHRDataAll;
    }

    public  void setGeneratedHRDataAll(TreeMap<String, List<HeartRate>> generatedHRDataAll) {
        GlobaModelHelper.generatedHRDataAll = generatedHRDataAll;
    }

    public  long getApplicationStartTime() {
        return applicationStartTime;
    }

    public void setApplicationStartTime(long applicationStartTime) {
        GlobaModelHelper.applicationStartTime = applicationStartTime;
    }

   

}
