/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sensordatagenerator;

import DataLoader.DataLoader;
import DataLoader.Export2File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jcp.xml.dsig.internal.dom.Utils;
import sensordatagenerator.Activity.Activity;
import sensordatagenerator.RawRandomGenerator.GlobaModelHelper;
import sensordatagenerator.RawRandomGenerator.*;
import sensoratagenerator.Sensors.Accelerometer;
import sensordatagenerator.Utils.DateTime;
import Classifier.ClassiferThread;
import GAREngine.sensordatastreamreceiver.SensorDataReceiver;
import com.sun.org.apache.xalan.internal.xsltc.compiler.util.ResultTreeType;
import java.util.AbstractList;
import java.util.Random;
import sensoratagenerator.Context.Context;
import sensoratagenerator.Context.GPS;
import sensoratagenerator.Sensors.AccelerometerCombined;
import sensoratagenerator.Sensors.Barometer;
import sensordatagenerator.Model.Individual;
import static sensordatagenerator.RawRandomGenerator.AccDataGeneratorUtils.generateRndNumberOfRowsPerSecond;

/**
 *
 * @author abakhshandehabk
 */
public class SensorDataGeneratorDriver {

    /**
     * @param args the command line arguments
     */
    public static List<AccelerometerCombined> combinedAccList = new ArrayList<AccelerometerCombined>();
    AccelerometerCombined accCombined;

    public static void main(String[] args) throws ParseException, InterruptedException {
        try {

            // TODO code application logic here
            List<Activity> activityList = new ArrayList<Activity>();
            List<Accelerometer> generatedAcc = new ArrayList<Accelerometer>();
            List<Individual> group = new ArrayList<Individual>();
            Activity ac;
            Context context;

            List<GPSSimModel> gpsModelList;

            //set start tiem of application 
            GlobaModelHelper.getInstance().setApplicationStartTime(System.currentTimeMillis());
            
            //set frequncy of accelerometer (hz)
            RawRandomGenerator.setFreqOfGeneratedWatch(100); //hz should be divided by 1000
            RawRandomGenerator.setFreqOfGeneratedMobile(200);
            //GPSDataGenerator.setFreqOfGeneratedGPS((double) 0.1); // 0.1 Hz means every 10 second (0.1 / 100 = 10sec || 10/100=0.1hz)
            GPSDataGenerator.setFreqOfGeneratedGPS((double) 5); // 0.01 mean every one second  
            //HeartRateDataGenerator.setFreqOfGeneratedHR((double) 0.6);
            HeartRateDataGenerator.setFreqOfGeneratedHR((double) 1); //every 60 sec
            
            RawBarometerGenerator.setFreqOfGeneratedBar((double) 5);

            RawRandomGenerator.setBatchGenerate(false);

            for (int i = 0; i < 100; i++) {
                //System.out.println(generateRndNumberOfRowsPerSecond(1000));
            }

            //fast :2
            ac = new Activity(Activity.ActivityName.TableTennis, "2016-04-20 19:20:01", "2016-04-20 19:30:01", Activity.ActivityPace.normal, "user1");
            activityList.add(ac);

            //ac = new Activity("TableTennsi", "2016-04-20 19:21:01", "2016-04-20 19:30:03", Activity.ActivityPace.normal,"user1");
            //activityList.add(ac);
            ac = new Activity(Activity.ActivityName.TableTennis, "2016-04-20 19:20:05", "2016-04-20 19:20:15", Activity.ActivityPace.normal, "user2");
            activityList.add(ac);

            Individual p1 = new Individual("Amin");
            Individual p2 = new Individual("John");
            Individual p3 = new Individual("Sara");
            Individual p4 = new Individual("Mary");
            List<Individual> group1 = new ArrayList<Individual>();

            group1.add(p1);
            group1.add(p2);

            for (int i = 0; i < 100; i++) {
                String name = "p";
                Individual individual = new Individual(name + i);
                //randomly assing a age 
                Random rand = new Random();
                int age = rand.nextInt((70 - 15) + 1) + 15;
                individual.setAge(age);
                group.add(individual);
            }

            //context=new GPS
            gpsModelList = new ArrayList<GPSSimModel>();
            Route waypoints = new Route(new Location("Waypoint 1", -37.7000688, 145.0462786));
            Location initLocation = new Location("initLoc", -37.7024212, 145.044288);
            //GPSSimModel gpsModel = new GPSSimModel(initLocation, waypoints, group, Activity.ActivityName.walking, "2016-04-20 19:20:05", "2016-04-20 19:20:55");
            //gpsModelList.add(gpsModel);
            GPSSimModel gpsModel = new GPSSimModel(initLocation, waypoints, p3, Activity.ActivityName.walking, "2016-04-20 19:20:10", "2016-04-20 19:20:30");
            gpsModelList.add(gpsModel);

            for (int i = 0; i < 5; i++) {
                String name = "p";
                Individual individual = new Individual(name + i);
                //randomly assing a age 
                Random rand = new Random();
                int age = rand.nextInt((70 - 15) + 1) + 15;
                individual.setAge(age);
                group.add(individual);
            }

            String user = "user";
            for (int i = 0; i < 5; i++) {
                ac = new Activity(Activity.ActivityName.TableTennis, "2016-04-20 19:20:05", "2016-04-20 19:20:40", Activity.ActivityPace.normal, user + String.valueOf(i + 3));
                activityList.add(ac);
            }

            Activity activity = new Activity(Activity.ActivityName.walking);
            HRSimModel hRSimModel = new HRSimModel(group, activity,"2016-04-20 19:20:05", "2016-04-20 19:20:40");
            //context= new 
            
            double initHeight = 106.25;
            BarSimModel barSimModel = new BarSimModel(group, BarSimModel.GradientMode.level3,"2016-04-20 19:20:05", "2016-04-20 19:20:40",initHeight);
            

//            //slow : 3
//            ac = new Activity("TableTennis", "2016-04-20 18:30:01", "2016-04-20 18:39:01", Activity.ActivityPace.fast);
//            activityList.add(ac);
            //normal player 2  
            //ac = new Activity("TableTennis", "2016-04-20 20:05:01", "2016-04-20 20:05:10", Activity.ActivityPace.fast);
            //activityList.add(ac);
            // generatedAcc = RawRandomGenerator.GenerateRandomData(data, activityList);
            //Classifier  thred get executed till stream of dat is comming 
            //ClassiferThread classifierThread = new ClassiferThread();
            //classifierThread.start();
            // This thread generated data based on defined activities. 
            // If batchGenerate flag is true all generated data is sotred in file out.csv
            // If batchGenerate flag is false RawRandomGenerator thread sleeps every (1000 / freqOfGenerated) msec
//**************************************************************************************************************************************
            
            //RawRandomGenerator ag = new RawRandomGenerator();
            //TreeMap<String, List<Accelerometer>> generateAccelerometerData = ag.generateAccelerometerData("mobile", activityList);
            
            GPSDataGenerator gpsgen = new GPSDataGenerator();
            gpsgen.generateGPSData(gpsModelList);

            //Heart Rate 
            //HeartRateDataGenerator hrgen = new HeartRateDataGenerator();
            //hrgen.generateHRData(hRSimModel);
            
            //RawBarometerGenerator rbg=new RawBarometerGenerator();
            //rbg.generateBarData(barSimModel);
            
            //SensorDataReceiver sensorDataReceiver=  new SensorDataReceiver();            
            //sensorDataReceiver.start();
            
            
            
//**************************************************************************************************************************************            
            //loads data from file for testing purposes 
            //TreeMap<String, List<Accelerometer>> generateAccelerometerData = DataLoader.LoadData("simulatedWatch.csv", "simulatedmobile.csv");
//            try {
//                Thread.sleep(1000);                 //5 second delay to save to make sure other thread finishing their jobs
//            } catch (InterruptedException ex) {
//                Thread.currentThread().interrupt();
//            }
            //Export2File.save2File(generateAccelerometerData);
            //combine(generateAccelerometerData);
            //Testing changeValue function
            //RawRandomGenerator.testChangeValue(-0.009576807);
        } catch (Exception ex) {
            Logger.getLogger(SensorDataGeneratorDriver.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
