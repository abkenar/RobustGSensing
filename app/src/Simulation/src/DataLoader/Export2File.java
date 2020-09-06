/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataLoader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import sensoratagenerator.Sensors.Accelerometer;
import sensordatagenerator.Utils.DateTime;

/**
 *
 * @author abakhshandehabk
 */
public class Export2File {

    public static void save2File(List<Accelerometer> generatedAccList, String outputFilename) {
        try {

            FileWriter fw = new FileWriter(outputFilename, true);
            StringBuilder outputMe = new StringBuilder();

            int i = 0;
            for (Accelerometer generatedAcc : generatedAccList) {

                if (generatedAcc != null) {
                    outputMe.append(generatedAcc.getTimeStamp()).append(",").append(DateTime.getDateByTimestamp(generatedAcc.getTimeStamp(), true)).append(",").append(generatedAcc.getX()).append(",").append(generatedAcc.getY()).append(",").append(generatedAcc.getZ()).append(",").append(generatedAcc.getPace());
                }

                fw.write(outputMe.toString());
                fw.write("\n");
                fw.flush();
                outputMe.setLength(0); //clear 

            }

            fw.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void save2File(TreeMap<String, List<Accelerometer>> generatedAccList) {
        try {

            FileWriter fw;
            List<String> keySet = new ArrayList<>();

            for (String key : generatedAccList.keySet()) {
                keySet.add(key);
            }

            if (generatedAccList.size() == 0) {
                return;
            }

            StringBuilder outputMe = new StringBuilder();

            for (int j = 0; j < generatedAccList.size(); j++) {

                List<Accelerometer> accList = generatedAccList.get(keySet.get(j));

                if (keySet.get(j).equalsIgnoreCase("watch")) {
                    fw = new FileWriter("watchOut.csv", true);
                } else {
                    fw = new FileWriter("MobileOut.csv", true);
                }

                for (Accelerometer generatedAcc : accList) {

                    if (generatedAcc != null) {
                        outputMe.append(generatedAcc.getTimeStamp()).append(",").append(DateTime.getDateByTimestamp(generatedAcc.getTimeStamp(), true)).append(",").append(generatedAcc.getX()).append(",").append(generatedAcc.getY()).append(",").append(generatedAcc.getZ()).append(",").append(generatedAcc.getPace());
                    }

                    if (generatedAcc == null) {
                        System.out.println("NULLLLLLLLLLLLLL");
                    }

                    fw.write(outputMe.toString());
                    fw.write("\n");
                    fw.flush();
                    outputMe.setLength(0); //clear 

                }

                fw.close();

            }

//           } int i=0;
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void save2File(Accelerometer generatedAcc, String outputFilename) {
        try {

            FileWriter fw = new FileWriter(outputFilename, true);
            StringBuilder outputMe = new StringBuilder();

            outputMe.append(generatedAcc.getTimeStamp()).append(",").append(DateTime.getDateByTimestamp(generatedAcc.getTimeStamp(), true)).append(",").append(generatedAcc.getX()).append(",").append(generatedAcc.getY()).append(",").append(generatedAcc.getZ()).append(",").append(generatedAcc.getPace());

            fw.write(outputMe.toString());
            fw.write("\n");
            fw.flush();
            outputMe.setLength(0); //clear 

            fw.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
