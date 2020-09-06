/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sensordatagenerator.RawRandomGenerator;

import DataLoader.DataLoader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.TreeMap;
import sensoratagenerator.Sensors.Accelerometer;
import sensoratagenerator.Sensors.AccelerometerCombined;
import sensordatagenerator.SensorDataGeneratorDriver;

/**
 *
 * @author DELL
 */
public class AccDataGeneratorUtils {

    public static double changeValue(Double value) {

        NumberFormat formatter = new DecimalFormat("#0.0000000");
        String strValue = value.toString();
        long decimalPart;
        double fractionPart;
        try {

            decimalPart = (long) Double.parseDouble(strValue);
            fractionPart = value - decimalPart;

            Random ran = new Random();
            int randomDecimal = ran.nextInt(2);
            double randomFraction = (double) (ran.nextInt(10000000 - 1000000 + 1) + 1000000) / 10000000;

            int newRandDecimal;
            if (randomDecimal % 2 == 0) {
                newRandDecimal = (int) decimalPart + randomDecimal;
            } else {
                newRandDecimal = (int) decimalPart - randomDecimal;
            }

            double newRandFraction = 0;
            if ((int) randomFraction % 2 == 0) {

                newRandFraction = randomFraction + fractionPart;
            } else {
                newRandFraction = fractionPart - randomFraction;
            }

            double newValue = newRandDecimal + newRandFraction;

            //System.out.println("Original Value :" + value + "   Random value: " + formatter.format(newValue));
            return Double.valueOf(formatter.format(newValue));

        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }

    }

    public static long generateRndTimeStamp(long previousTimeStamp) {

        long generatedTimestamp = 0;

        while (!(generatedTimestamp - previousTimeStamp > 0)) {
            Random ranTime = new Random();
            long newGeneraredTimeStamp;

            long last4Digits = previousTimeStamp % 10000;
            long first9Digits = previousTimeStamp / 10000;

            if (last4Digits != 0) {
                newGeneraredTimeStamp = (long) ranTime.nextInt(10000 - (int) last4Digits + 1) + last4Digits;

                // This while make sure that geenrated number is 20 millis second greater than previosu time stamp
                while (newGeneraredTimeStamp - last4Digits > 20) {
                    newGeneraredTimeStamp = (long) ranTime.nextInt(10000 - (int) last4Digits + 1) + last4Digits;
                }
            } else { // e.g 1461146700000   wrong: 14611467010000
                //newGeneraredTimeStamp = (long) ranTime.nextInt(10000 - (int) 1000 + 1) + 1000;

                //geenrates an integer b/w 1000 - 1020
                newGeneraredTimeStamp = (long) ranTime.nextInt(1020 - 1000 + 1) + 1000;

                System.out.println("HERE ....");

            }

//        System.out.println("new generated : " + newGeneraredTimeStamp);
//        System.out.println("first digits : " + first9Digits);
//        System.out.println("NEW TIMESTAMP : " + 1000*newGeneraredTimeStamp+first9Digits);
            String str = String.valueOf(first9Digits) + String.valueOf(newGeneraredTimeStamp);

            // previous time stamp must be 13 size. 
            if (String.valueOf(str).length() > 13) {
                str = String.valueOf(previousTimeStamp).substring(0, 13);
            }

            generatedTimestamp = Long.valueOf(str);

            //return newGeneraredTimeStamp+first9Digits;
            System.out.println("inside of timestamp generator  +++++++++++++++++++++++++++++++++++++++++++++++++: ");
            System.out.println("previos " + previousTimeStamp + " generated  " + generatedTimestamp);
        }
        return generatedTimestamp;
    }

    public static long generateRndTimeStampSimple(long previousTimeStamp) {
        long generatedTimestamp = 0;

        Random ranTime = new Random();
        //geenrates an integer b/w 1000 - 1020
        long newGeneraredTimeStamp = (long) ranTime.nextInt(25 - 5 + 1) + 5;

        return previousTimeStamp + newGeneraredTimeStamp;
    }

    // generates an array of time stamp for given timestamp for duration of 1 second 
    //numbr of rows : Th number of rows which is produced every second
    public static List<Long> generateRndTimeStampSeries(long startTimeStamp, int numOfRows) {
        List<Long> generatedTimestamps = new ArrayList<Long>();

        Random ranTime = new Random();
        int avgTimeStampFrequncy = 1000 / numOfRows;
        int max = avgTimeStampFrequncy + 3;
        int min = avgTimeStampFrequncy - 2;
        Long generatedTimeStamp = startTimeStamp;
        int incTimeAtampBy = 0;

        for (int i = 0; i < numOfRows - 1; i++) {

            incTimeAtampBy = ranTime.nextInt(max - min) + min;
            generatedTimeStamp = generatedTimeStamp + incTimeAtampBy;

            if (generatedTimeStamp < startTimeStamp + 1000) {
                generatedTimestamps.add(generatedTimeStamp);
            } else {
                while ((generatedTimeStamp < startTimeStamp + 1000)) {
                    incTimeAtampBy = ranTime.nextInt(max - min) + min;
                    generatedTimeStamp = generatedTimeStamp + incTimeAtampBy;
                }
                generatedTimestamps.add(generatedTimeStamp);
            }

        }

        generatedTimestamps.add(startTimeStamp + 999);

        return generatedTimestamps;
    }

    public static int generateRndNumberOfRowsPerSecond(int sensorFreq) {

        int rowNumbers = 0;

        Random ranTime = new Random();
        //geenrates an integer b/w 1000 - 1020
        rowNumbers = ranTime.nextInt(sensorFreq - (int) (0.95 * sensorFreq)) + (int) (0.95 * sensorFreq);

        return rowNumbers;
    }

    public static void testChangeValue(Double value) {
        System.out.println("Original : " + value);
        double d = changeValue(value);
        //System.out.print("changed : " + d);
    }

    public static List<AccelerometerCombined> combine(TreeMap<String, List<Accelerometer>> genAccDataHash) throws IOException {
        //fetch last 200 record from both mobile and watch

        List<AccelerometerCombined> combined = new ArrayList<AccelerometerCombined>();
        List<Accelerometer> watchTemp = genAccDataHash.get("watch");
        List<Accelerometer> mobileTemp = genAccDataHash.get("mobile");

        List<Accelerometer> lastWatchData = new ArrayList<Accelerometer>();
        List<Accelerometer> lastMobileData = new ArrayList<Accelerometer>();

        lastWatchData = getLastN_Seconds(watchTemp, 5);
        lastMobileData = getLastN_Seconds(mobileTemp, 5);

        List<Accelerometer> unusedAccData = new ArrayList<Accelerometer>();

        Accelerometer bufferLastAvged = null;

        //Export2File.save2File(lastWatchData, "simulatedWatch.csv");
        //Export2File.save2File(lastMobileData, "simulatedMobile.csv");
        long firstRowTimeDiff = 0;
        long secondRowTimeDiff = 0;
        int j = 0; // pointer for higher frequency sensor 

        //if starting points from two datasets is not close together, 'first index' in which its time stamps is close, must be found. 
        //int indexCounter = 0;
        AccDataGeneratorUtils.ResultType rt = new AccDataGeneratorUtils.ResultType();
        rt = findStartingIndex(DataLoader.getAccListByFile("simulatedWatch.csv"), DataLoader.getAccListByFile("simulatedMobile.csv"));

        //j is used as starting point of param2 (in this case mobile which has higher frequency)
        j = rt.getIndex2();

        boolean notFoundIndex = true;
        int counterLowerFreq = 0;
        int counterHigherFreq = 0;

//        while (Math.abs(lastWatchData.get(0).getTimeStamp() - lastMobileData.get(indexCounter).getTimeStamp()) >= 20) {
//            indexCounter++;
//            System.err.println(indexCounter);
//            //
//            if (indexCounter > 2000) {
//                return null;
//            }
//        }
        //j = indexCounter;
        int f1 = counterHigherFreq;
        int f2 = counterLowerFreq;

        //execute this loop fo all watch data 
        // i=rt.getIndex1() is first row of lower frequency decvice (in this case, watch)
        for (int i = rt.getIndex1(); i < lastWatchData.size() - 1; i++) {

            List<Accelerometer> tempHigherFreq = new ArrayList<Accelerometer>();
            boolean foundDataForFusion = false;

            Accelerometer firstRowWatch = lastWatchData.get(i);
            Accelerometer secondRowWatch = lastWatchData.get(i + 1);
            Accelerometer firstRowMobile = lastMobileData.get(i);

            List<Double> xForAvg = new ArrayList<Double>();
            List<Double> yForAvg = new ArrayList<Double>();
            List<Double> zForAvg = new ArrayList<Double>();

            System.out.println(i + ": " + firstRowWatch.getTimeStamp() + "     j:" + j + "   " + lastMobileData.get(j).getTimeStamp());
            if (i == 481) {
                System.err.println("come here");
            }

            boolean isLessThreshold = false;
            boolean iscloserToNextRow = false;

            //check first i th row of lower frequency sensor with rows of higher frequenct 
            // if 
            while (((Math.abs(firstRowWatch.getTimeStamp() - lastMobileData.get(j).getTimeStamp())) <= 20)
                    && ((Math.abs(firstRowWatch.getTimeStamp() - lastMobileData.get(j).getTimeStamp()))
                    < (Math.abs(secondRowWatch.getTimeStamp() - lastMobileData.get(j).getTimeStamp())))) {

                //List <Accelerometer> tempForAvg = new ArrayList<Accelerometer>();
                //increase pointer of 
                j++;

                //check if j (higher freq iterator) reached to end of list or lower freq reaches to othe end
                if (j == lastMobileData.size() || i == lastWatchData.size()) {
                    for (int k = i; k < lastWatchData.size(); k++) {

                        if (bufferLastAvged != null) {
                            double xBuffer = bufferLastAvged.getX();
                            double yBuffer = bufferLastAvged.getY();
                            double zBuffer = bufferLastAvged.getZ();
                            AccelerometerCombined combinedTemp = new AccelerometerCombined(lastWatchData.get(i).getX(), lastWatchData.get(i).getY(), lastWatchData.get(i).getZ(),
                                    xBuffer, yBuffer, zBuffer, lastWatchData.get(i).getTimeStamp());
                            combined.add(combinedTemp);
                        }

                    }

                    return combined;
                }

                xForAvg.add(lastMobileData.get(j).getX());
                yForAvg.add(lastMobileData.get(j).getY());
                zForAvg.add(lastMobileData.get(j).getZ());

                foundDataForFusion = true;
            }

            if (foundDataForFusion) {
                double xAvg = 0;
                double yAvg = 0;
                double zAvg = 0;
                for (int k = 0; k < xForAvg.size(); k++) {
                    xAvg = xAvg + xForAvg.get(k);
                    yAvg = yAvg + yForAvg.get(k);
                    yAvg = yAvg + yForAvg.get(k);
                }
                xAvg = xAvg / xForAvg.size();
                yAvg = yAvg / yForAvg.size();
                zAvg = yAvg / zForAvg.size();

                AccelerometerCombined combinedTemp = new AccelerometerCombined(lastWatchData.get(i).getX(), lastWatchData.get(i).getY(), lastWatchData.get(i).getZ(),
                        xAvg, yAvg, zAvg, lastWatchData.get(i).getTimeStamp());
                combined.add(combinedTemp);

                // make a copy for further use 
                bufferLastAvged = new Accelerometer(xAvg, yAvg, zAvg, lastWatchData.get(i).getTimeStamp());

            } else { //not found any data for fusion
                System.err.println("not found for fusion ...");
                //find the narest data to fuse. Iterator is inreased till find 

                long tt = Math.abs(bufferLastAvged.getTimeStamp() - lastWatchData.get(i).getTimeStamp());
                if ((bufferLastAvged != null) && (tt < 200)) {
                    //double xBuffer = bufferLastAvged.getX();
                    //double yBuffer = bufferLastAvged.getY();
                    //double zBuffer = bufferLastAvged.getZ();
                    //AccelerometerCombined combinedTemp = new AccelerometerCombined(lastWatchData.get(i).getX(), lastWatchData.get(i).getY(), lastWatchData.get(i).getZ(),
                    //xBuffer, yBuffer, zBuffer, lastWatchData.get(i).getTimeStamp());
                    //combined.add(combinedTemp);

                    // checks if next row of higher freq is not equal to current row of lower freq
                    if (lastWatchData.get(i).getTimeStamp() < lastMobileData.get(j).getTimeStamp()) {
                        //do nothing 
                        unusedAccData.add(lastMobileData.get(i));
                    } else if (lastWatchData.get(i).getTimeStamp() > lastMobileData.get(j).getTimeStamp()) {
                        i--;
                        j++;
                        unusedAccData.add(lastMobileData.get(j));
                    }

                }

            }
        }

        return combined;
    }

    public static List<Accelerometer> getLastN_Seconds(List<Accelerometer> sensorData, int lastN_Seconds) {

        //fetch last 200 record from both mobile and watch
        Accelerometer lastRow = sensorData.get(sensorData.size() - 1);
        List<Accelerometer> lastNSecondArray = new ArrayList<Accelerometer>();
        List<Accelerometer> tempNSecondArray = new ArrayList<Accelerometer>();
        int i = 2;
        tempNSecondArray.add(lastRow);
        while ((lastRow.getTimeStamp() - sensorData.get(sensorData.size() - i).getTimeStamp() < lastN_Seconds * 1000) && (sensorData.size() > i)) {
            tempNSecondArray.add(sensorData.get(sensorData.size() - i));
            i++;

            if (sensorData.size() == i) { // for the fisr element
                tempNSecondArray.add(sensorData.get(sensorData.size() - i));
            }
        }

        for (int j = 1; j <= tempNSecondArray.size(); j++) {
            lastNSecondArray.add(tempNSecondArray.get(tempNSecondArray.size() - j));
        }

        return lastNSecondArray;
    }

    //
    public static AccDataGeneratorUtils.ResultType findStartingIndex(List<Accelerometer> accList1, List<Accelerometer> accList2) {
        AccDataGeneratorUtils.ResultType rt = new AccDataGeneratorUtils.ResultType();

        for (int i = 0; i < accList1.size(); i++) {
            for (int j = 0; j < accList2.size(); j++) {

                if (Math.abs(accList1.get(i).getTimeStamp() - accList2.get(j).getTimeStamp()) <= 20) {
                    rt.setIndex1(i); //starting point for para1
                    rt.setIndex2(j); //starting point for para2
                    return rt;
                }
            }
        }

        return rt;

    }

    public static class ResultType {

        private int index1;
        private int index2;
        private String source;

        public int getIndex1() {
            return index1;
        }

        public String getSource() {
            return source;
        }

        public void setIndex1(int index1) {
            this.index1 = index1;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public int getIndex2() {
            return index2;
        }

        public void setIndex2(int index2) {
            this.index2 = index2;
        }

    }

}
