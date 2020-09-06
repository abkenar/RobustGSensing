/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sensordatagenerator.RawRandomGenerator;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import sensoratagenerator.Context.GPS;
import sensoratagenerator.Sensors.HeartRate;
import sensordatagenerator.Activity.Activity;
import sensordatagenerator.Model.Individual;
import static sensordatagenerator.RawRandomGenerator.GPSDataGenerator.generateNextTimeStamp;
import static sensordatagenerator.RawRandomGenerator.GlobaModelHelper.generatedGPSDataAll;
import static sensordatagenerator.RawRandomGenerator.GlobaModelHelper.generatedHRDataAll;
import sensordatagenerator.Utils.DateTime;

/**
 *
 * @author DELL
 */
public class HeartRateDataGenerator {

    List<HRDataGeneratorThread> hrThreadList;
    public static Double freqOfGeneratedHR;
    HRSimModel hrSimModel;
    //long nextTimeStamp;

    public static void setFreqOfGeneratedHR(double freq) {
        freqOfGeneratedHR = freq;
    }

    public static double getFreqOfGeneratedHR() {
        return freqOfGeneratedHR;
    }

    //this method  invioked from Driver Class 
    public void generateHRData(HRSimModel hrSimModel) throws ParseException {

        hrThreadList = new ArrayList<HRDataGeneratorThread>();
        HRDataGeneratorThread hrThread;
        this.hrSimModel = hrSimModel;
        // constrcut required threads 
        if (true) {
            for (int i = 0; i < hrSimModel.getGroup().size(); i++) {

                hrThread = new HRDataGeneratorThread(hrSimModel.getGroup().get(i), hrSimModel.getActivity(), hrSimModel.getStartTime(), hrSimModel.getEndTime());
                hrThreadList.add(hrThread);
            }
        } else {

        }

        HeartRateDataGenerator.HRThreadListRunner hrThreadListRunner = new HeartRateDataGenerator.HRThreadListRunner();
        hrThreadListRunner.start();
    }
//==================================================================================
    //this thread generate 

    public class HRDataGeneratorThread extends Thread {

        Individual individula;
        Activity activity;
        boolean threadRunning = true;
        long endTime;
        long startTime;
        long nextTimeStamp;

        HRDataGeneratorThread(Individual individual, Activity activity, String startTime, String endTime) throws ParseException {
            this.activity = activity;
            this.individula = individual;
            nextTimeStamp = DateTime.getTimeStampByTimeDate(startTime, false);
            this.endTime = DateTime.getTimeStampByTimeDate(endTime, false);
            this.startTime = DateTime.getTimeStampByTimeDate(startTime, false);
        }

        public int generateHR() {

            int age = individula.getAge();
            int max = 0;
            int min = 0;
            //check the age range and return predefined values 
            if (age >= 20 && age < 30) {

                min = 100;
                max = 170;

            } else if (age >= 30 && age < 35) {
                min = 95;
                max = 162;
            }

            //hard , moderate
            if (activity.getName().equals(activity.getName().walking)) {
                min = (int) Math.round(0.5 * (200));
                max = (int) Math.round(0.69 * (200));
            }

            if (activity.getName().equals(activity.getName().running)) {
                min = (int) Math.round(0.7 * (200));
                max = (int) Math.round(0.9 * (200));
            }

            //nextTimeStamp = generateNextTimeStamp(nextTimeStamp, HeartRateDataGenerator.getFreqOfGeneratedHR());
            nextTimeStamp = generateNextTimeStamp(nextTimeStamp, HeartRateDataGenerator.getFreqOfGeneratedHR());

            Random rand = new Random();

            int r = rand.nextInt((max - min) + 1) + min;
            return r;
        }

        @Override
        public void run() {
            // TODO Auto-generated method stub
            super.run();

            //In order to make all other threads not very close together we delay thread for the first time of running. 
            Random delayRnd = new Random();
            try {
                Thread.sleep(delayRnd.nextInt((3500 - 500) + 1) + 500); //1 sec
            } catch (InterruptedException ex) {
                Logger.getLogger(HeartRateDataGenerator.class.getName()).log(Level.SEVERE, null, ex);
            }

            while (threadRunning) {

                int hr = generateHR();

                //construct HR model to be saved in generatedHRDataAll
                HeartRate hrData = new HeartRate(nextTimeStamp, hr);

                //adds geenrated GPS data into model 
                if (!generatedHRDataAll.containsKey(individula.getName())) {
                    generatedHRDataAll.put(individula.getName(), new ArrayList<HeartRate>());
                }
                generatedHRDataAll.get(individula.getName()).add(hrData);

                System.out.println("HR FROM : " + individula.getName() + " at: " + DateTime.getDateByTimestamp(nextTimeStamp,false)  + " ***  " + String.valueOf(hr));
                //calculate next thread delay
                try {
                    Thread.sleep((long) (1000 * HeartRateDataGenerator.getFreqOfGeneratedHR()));
                    System.out.println("HR Thread Delayed" + individula.getName());
                } catch (InterruptedException ex) {
                    Logger.getLogger(RawRandomGenerator.class.getName()).log(Level.SEVERE, null, ex);
                }

                if (nextTimeStamp > endTime) {
                    threadRunning = false;
                    System.out.println("HR Thread " + individula.getName() + " finished");
                }

            }
        }

    }

    //handle all threads for generating HR  Data
    public class HRThreadListRunner extends Thread {

        List<Thread> GPShreads;

        @Override
        public void run() {
            // TODO Auto-generated method stub
            super.run();
            HeartRateDataGenerator hrSimulator = new HeartRateDataGenerator();

            HRDataGeneratorThread previous = null;
            HRDataGeneratorThread current = null;

            for (int i = 0; i < hrThreadList.size(); i++) {

//                //start and sleep threads here...
//                hrThreadList.get(i).start();
//                //calculate next thread delay
                current = hrThreadList.get(i);

                if (previous != null) {
                    if (current.startTime - previous.startTime > 0) {
                        try {
                            //delay
                            System.out.println("GPS Thread Delayed");
                            Thread.sleep(current.endTime - previous.startTime);
                            current.start();
                        } catch (InterruptedException ex) {
                            Logger.getLogger(HRThreadListRunner.class.getName()).log(Level.SEVERE, null, ex);
                        }

                    } else {
                        System.out.println("HR Thread Started ");
                        current.start();
                    }
                } else // first thread ,  runs only once 
                {
                    System.out.println("First HR Thread Started From");
                    current.start();
                }

                //calculate next thread delay
                previous = current;
                // if (gpsThreadList.get(i).)

            }

        }

    }

}
