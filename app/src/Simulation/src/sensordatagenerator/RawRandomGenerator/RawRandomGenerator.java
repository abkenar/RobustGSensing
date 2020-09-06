/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sensordatagenerator.RawRandomGenerator;

import DataLoader.DataLoader;
import DataLoader.Export2File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import sensoratagenerator.Sensors.Accelerometer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;
import sensordatagenerator.Activity.Activity;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.midi.SysexMessage;
import jdk.nashorn.internal.runtime.regexp.joni.Config;
import sensordatagenerator.Utils.DateTime;
import sensordatagenerator.RawRandomGenerator.GlobaModelHelper;

/**
 *
 * @author abakhshandehabk
 */
public class RawRandomGenerator {

    public static int freqOfGeneratedWatch;
    public static int freqOfGeneratedMobile;
    public static int activityDuration;
    boolean continiue = true;
    //static long startTimeStamp = 0;
    //static long timeStamp = 0;
    //if batchGenerate=true, geenrate all the data at once. Otherwise interrupts like a actual sensor by considering sensor frequency 
    static boolean batchGenerate = false;
    public long timeCounter = 0;
    public ArrayList<Accelerometer> rawDataSetWatch;
    public ArrayList<Accelerometer> rawDataSetMobile;
    public static List<Accelerometer> generatedAccListWatch = new ArrayList<Accelerometer>();
    public static List<Accelerometer> generatedAccListMobile = new ArrayList<Accelerometer>();
    //public static boolean running;
    TreeMap<String, ArrayList<Accelerometer>> watchData;
    TreeMap<String, ArrayList<Accelerometer>> mobileData;
    AccDataGeneratorThread gThreadWatch;
    AccDataGeneratorThread gThreadMobile;

    ActivityThreadListRunner atlrThread;

    public static TreeMap<String, List<Accelerometer>> generateAccelerometerData = new TreeMap<String, List<Accelerometer>>();

    public static void setFreqOfGeneratedWatch(int freq) {
        freqOfGeneratedWatch = freq;
    }

    public static int getFreqOfGeneratedWatch() {
        return freqOfGeneratedWatch;
    }

    public static void setFreqOfGeneratedMobile(int freq) {
        freqOfGeneratedMobile = freq;
    }

    public static int getFreqOfGeneratedMobile() {
        return freqOfGeneratedMobile;
    }

    public static boolean isBatchGenerate() {
        return batchGenerate;
    }

    public static void setBatchGenerate(boolean batchGenerate) {
        RawRandomGenerator.batchGenerate = batchGenerate;
    }

    // this method is called from driver
    public TreeMap<String, List<Accelerometer>> generateAccelerometerData(String sourceType, List<Activity> activityList) throws ParseException, InterruptedException //duration : sec  
    {

        //int i=0;
        Map<String, Thread> activityThreads = new HashMap<>();

        List<Thread> threads = new ArrayList<Thread>();

        try {

            if (sourceType.equalsIgnoreCase("watch")) {
                watchData = DataLoader.loadActivityData("watch", "TableTennis");
            } else if ((sourceType.equalsIgnoreCase("mobile"))) {
                mobileData = DataLoader.loadActivityData("mobile", "TableTennis");
            } else if ((sourceType.equalsIgnoreCase("both"))) {
                watchData = DataLoader.loadActivityData("watch", "TableTennis");
                mobileData = DataLoader.loadActivityData("mobile", "TableTennis");
            }

        } catch (IOException ex) {
            Logger.getLogger(RawRandomGenerator.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (Activity activity : activityList) {

            activityDuration = DateTime.getSecDifference(activity.getStart_time(), activity.getEnd_time());

            Long startTimeStamp = DateTime.getTimeStampByTimeDate(activity.getStart_time(), false);

            //fetch all records related to given pace and defines threads 
            if (sourceType.equalsIgnoreCase("watch")) {
                //rawDataSetWatch = watchData.get(String.valueOf(activity.getPaceValue()));
                rawDataSetWatch = watchData.get(String.valueOf(activity.getPace()));
                gThreadWatch = new AccDataGeneratorThread(activity.getPace().toString(), rawDataSetWatch, "watch", startTimeStamp, getFreqOfGeneratedWatch());
                threads.add(gThreadWatch);
                activityThreads.put(activity.getStart_time(), gThreadWatch);

            } else if ((sourceType.equalsIgnoreCase("mobile"))) {
                //rawDataSetMobile = mobileData.get(String.valueOf(activity.getPaceValue()));
                rawDataSetMobile = mobileData.get(String.valueOf(activity.getPace()));
                gThreadMobile = new AccDataGeneratorThread(activity.getPace().toString(), rawDataSetMobile, "mobile", startTimeStamp, getFreqOfGeneratedMobile());
                threads.add(gThreadMobile);
                activityThreads.put(activity.getStart_time(), gThreadMobile);

            } else if ((sourceType.equalsIgnoreCase("both"))) {
                //rawDataSetWatch = watchData.get(String.valueOf(activity.getPaceValue()));
                //rawDataSetMobile = mobileData.get(String.valueOf(activity.getPaceValue()));
                rawDataSetWatch = watchData.get(String.valueOf(activity.getPace()));
                rawDataSetMobile = mobileData.get(String.valueOf(activity.getPace()));
                gThreadWatch = new AccDataGeneratorThread(activity.getPace().toString(), rawDataSetWatch, "watch", startTimeStamp, getFreqOfGeneratedWatch());
                gThreadMobile = new AccDataGeneratorThread(activity.getPace().toString(), rawDataSetMobile, "mobile", startTimeStamp, getFreqOfGeneratedMobile());
                threads.add(gThreadWatch);
                threads.add(gThreadMobile);
                activityThreads.put(activity.getStart_time(), gThreadWatch);
                activityThreads.put(activity.getStart_time(), gThreadMobile);
            }

            //synchronized (this) {
            //map.put("gThread" + i, new AccDataGeneratorThread(activity.getPace().toString()));
            //map.get("gThread" + i).start();
            //running = true;
            //gThread.start();
            //  try {
            //     gThread.join();
            //  } catch (InterruptedException ex) {
            //    Logger.getLogger(RawRandomGenerator.class.getName()).log(Level.SEVERE, null, ex);
            //  }
            //}
        }
        
        //This Thread runs other treads and manages all other threads (list of activities) timings 
        atlrThread = new ActivityThreadListRunner(activityThreads);
        atlrThread.start();
        //running = true;

//        for (int j = 0; j < threads.size(); j++) {
//
//            //check Start time and start thread accordingly 
//            threads.get(j).start();
//            System.out.println("Starting Thread " + j);
//            
//             
//        }
//
//        for (int k = 0; k < threads.size(); k++) {
//            threads.get(k).join();
//            System.out.println("joint Thread " + k);
//        }
        GlobaModelHelper.getInstance().setDataGeneratedFinished(true);

        return generateAccelerometerData;
    }

    public void sortActivityThreadsByTime(List<Thread> activityThreadList) {

    }

    private class ActivityThreadListRunner extends Thread {

        Map<String, Thread> activityThreads;

        //constructor
        public ActivityThreadListRunner(Map<String, Thread> activityThreads) {
            this.activityThreads = activityThreads;
            System.out.println("HERRRRRR 0000000");
        }
        boolean running = true;

        @Override
        public void run() {
            // TODO Auto-generated method stub
            super.run();

            Set keys = activityThreads.keySet();
            String key = (String) keys.toArray()[0];
            //sort threads 

            while (running) {
                for (int i = 0; i < activityThreads.size(); i++) {

                    activityThreads.get("2016-04-20 19:20:01").start();
                    System.out.println("Thread 1 Started");

                    try {
                        //calculate next thread delay
                        int delay = DateTime.getSecDifference("2016-04-20 19:20:01", "2016-04-20 19:20:05");
                        try {
                            Thread.sleep(delay * 1000);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(RawRandomGenerator.class.getName()).log(Level.SEVERE, null, ex);
                        }

                        activityThreads.get("2016-04-20 19:20:05").start();
                        System.out.println("Thread 2 Started");

                    } catch (ParseException ex) {
                        Logger.getLogger(RawRandomGenerator.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
                running = false;

            }
        }
    }

}
