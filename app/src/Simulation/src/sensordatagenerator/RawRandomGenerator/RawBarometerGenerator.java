/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sensordatagenerator.RawRandomGenerator;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import sensoratagenerator.Sensors.Barometer;
import sensordatagenerator.Model.Individual;
import static sensordatagenerator.RawRandomGenerator.GPSDataGenerator.generateNextTimeStamp;
import sensordatagenerator.Utils.DateTime;

/**
 *
 * @author DELL
 */
public class RawBarometerGenerator {

    List<BarDataGeneratorThread> barThreadList;
    public static Double freqOfGeneratedBar;

    public static Double getFreqOfGeneratedBar() {
        return freqOfGeneratedBar;
    }

    public static void setFreqOfGeneratedBar(Double freqOfGeneratedBar) {
        RawBarometerGenerator.freqOfGeneratedBar = freqOfGeneratedBar;
    }

    //this method  invioked from Driver Class 
    public void generateBarData(BarSimModel barSimModel) {

        barThreadList = new ArrayList<BarDataGeneratorThread>();
        BarDataGeneratorThread barThread;
        // constrcut required threads 
        if (true) {
            for (int i = 0; i < 5; i++) {

                barThread = new BarDataGeneratorThread();
                barThreadList.add(barThread);
            }
        } else {

        }

        RawBarometerGenerator.BarDataGeneratorThread barThreadListRunner = new RawBarometerGenerator.BarDataGeneratorThread();
        barThreadListRunner.start();
    }
//==================================================================================
    //this thread generate 

    public class BarDataGeneratorThread extends Thread {

        Individual individula;
        boolean threadRunning = true;
        long endTime;
        long startTime;
        String mode;
        long nextTimeStamp;
        int duration;

        public BarDataGeneratorThread(Individual individula, long startTime, long endTime, String mode, long nextTimeStamp) throws ParseException {
            this.individula = individula;
            this.endTime = endTime;
            this.startTime = startTime;
            this.mode = mode;
            this.nextTimeStamp = startTime;
            duration = DateTime.getSecDifference(startTime, endTime);
        }

        public BarDataGeneratorThread() {

        }

        public void generateBarometer() {

            //by given gradient level and init value we should calculate barometer value each time 
            
            
            nextTimeStamp = generateNextTimeStamp(nextTimeStamp, RawBarometerGenerator.getFreqOfGeneratedBar());
        }

        @Override
        public void run() {
            // TODO Auto-generated method stub
            super.run();

            while (threadRunning) {
                
                generateBarometer();

                //calculate next thread delay
                try {
                    Thread.sleep((long) (1000 / RawBarometerGenerator.getFreqOfGeneratedBar()));
                    //Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(RawRandomGenerator.class.getName()).log(Level.SEVERE, null, ex);
                }

                if (nextTimeStamp > endTime) {
                    threadRunning = false;
                    System.out.println("Barometer Thread " + individula.getName() + " finished");
                }

            }
        }

    }

    //handle all threads for generating GPS Data
    public class BarThreadListRunner extends Thread {

        List<Thread> GPShreads;

        @Override
        public void run() {
            // TODO Auto-generated method stub
            super.run();
            GPSDataGenerator gpsSimulator = new GPSDataGenerator();

            for (int i = 0; i < barThreadList.size(); i++) {

                //start and sleep threads here...
                barThreadList.get(i).start();
                //calculate next thread delay

            }

        }

    }

}
