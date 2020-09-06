/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sensordatagenerator.RawRandomGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import sensoratagenerator.Sensors.Accelerometer;
import static sensordatagenerator.RawRandomGenerator.AccDataGeneratorUtils.*;
import static sensordatagenerator.RawRandomGenerator.RawRandomGenerator.activityDuration;
import static sensordatagenerator.RawRandomGenerator.RawRandomGenerator.batchGenerate;
//import static sensordatagenerator.RawRandomGenerator.RawRandomGenerator.changeValue;
import static sensordatagenerator.RawRandomGenerator.RawRandomGenerator.generateAccelerometerData;
import static sensordatagenerator.RawRandomGenerator.RawRandomGenerator.generateAccelerometerData;
//import static sensordatagenerator.RawRandomGenerator.RawRandomGenerator.generateRndNumberOfRowsPerSecond;
//import static sensordatagenerator.RawRandomGenerator.RawRandomGenerator.generateRndTimeStampSeries;

/**
 *
 * @author DELL
 */
    public class AccDataGeneratorThread extends Thread {

        private String pace;
        private ArrayList<Accelerometer> rawDataSet;
        private String mode;
        private Long startTime;
        private int frequency;

        public AccDataGeneratorThread(String pace, ArrayList<Accelerometer> data, String mode, Long startTimeStamp, int frequency) {
            this.pace = pace;
            this.rawDataSet = data;
            this.mode = mode;
            this.startTime = startTimeStamp;
            this.frequency = frequency;
        }

        @Override
        public void run() {
            // TODO Auto-generated method stub
            super.run();

            boolean running = true;
            System.out.println("Start of Thread -- Generating Data");

            //long ss = generateRndTimeStamp(Long.valueOf("1461146703908"));
            long timeStamp = startTime;
            while (running) {

                int cnt = 1;

                // activityDuration is number of seconds which actvity is taking place
                for (int k = 0; k < activityDuration; k++) {
                    try {
                        Random ran = new Random();
                        int randomeRowNumber = ran.nextInt(rawDataSet.size());

                        List<Long> timeStamps = new ArrayList<Long>();

                        //this function return a random integer b/w  frequency - 5 and frequency
                        int numOfRows = generateRndNumberOfRowsPerSecond(frequency);
                        
                        List<Long> generateRndTimeStamps = generateRndTimeStampSeries(timeStamp, numOfRows);
                        
                        // for every second this loop is executed depends on given frequency 
                        for (int j = 0; j < numOfRows; j++) {
                            Accelerometer acc = rawDataSet.get(randomeRowNumber++);

                            //long genTimeStamp = generateRndTimeStampSimple(timeStamp);
                            Accelerometer genAcc = new Accelerometer(changeValue(acc.getX()), changeValue(acc.getY()), changeValue(acc.getZ()), generateRndTimeStamps.get(j), pace);

                            if (!generateAccelerometerData.containsKey(mode)) {
                                generateAccelerometerData.put(mode, new ArrayList<Accelerometer>());
                            }

                            generateAccelerometerData.get(mode).add(genAcc);

                            //System.out.println(genAcc.getTimeStamp() + " : " + genAcc.getX() + " ," + genAcc.getZ() + " From:" + mode);

                            //generatedAccList.add(genAcc);
                            GlobaModelHelper.getInstance().addSimulatedAccSensor(genAcc);

                            //update previous timeStamp
                            //timeStamp = genTimeStamp;
                            //Thread.sleep((1 / 100) * 1000); //20 msec interrupt -> We assumed that frequency of accelerometer sensor is 100Hz
                            if (!batchGenerate) {
                                Thread.sleep(1000 / frequency); //10 msec
                            }

                            timeStamp = generateRndTimeStamps.get(j);
                        }

                        //after first minute make sure timeStamp has increased properly
                        //timeStamp = startTimeStamp + cnt * 1000;
                        cnt++;

                        //} catch (InterruptedException ex) {
                    } catch (Exception ex) {

                        System.out.println("exception");
                        Logger.getLogger(RawRandomGenerator.class.getName()).log(Level.SEVERE, null, ex);

                    }

                    //System.out.println(cnt);
                }
                running = false;
                System.out.println("rinning is false");
                //running = false;
            }
            System.out.println("++++++++++++++++++++++++ End of Thread ++++++++++++++++++++++");

        }
    }