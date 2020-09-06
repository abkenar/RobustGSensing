/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataLoader;

import sensoratagenerator.Sensors.Accelerometer;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author abakhshandehabk
 */
public class DataLoader {

    //Reads raw data from csv file and load it into TreeMap
    // Source Type : watch, mobile or both
    
    TreeMap<String, ArrayList<Accelerometer>> aa;
    
    public static TreeMap<String, ArrayList<Accelerometer>> loadActivityData(String sourceType, String activity) throws IOException {

        TreeMap<String, ArrayList<Accelerometer>> data = new TreeMap<String, ArrayList<Accelerometer>>();

        String inputFile = "";

        if (sourceType.equalsIgnoreCase("watch")) {
            //inputFile = "all_watch.csv";
            inputFile = "ActivityRawSensorDataRepository\\all_watch.csv";
        } else if (sourceType.equalsIgnoreCase("mobile")) {
            //inputFile = "all_mobile.csv";
            inputFile = "ActivityRawSensorDataRepository\\tabletennis_mobile.csv";
            
        }
        else if (activity.equalsIgnoreCase("walking") || activity.equalsIgnoreCase("running") || activity.equalsIgnoreCase("jogging") || activity.equalsIgnoreCase("cycling") || activity.equalsIgnoreCase("inactive")) {
            //inputFile = "all_mobile.csv";
            inputFile = "ActivityRawSensorDataRepository\\walking-jogging-mobile.csv";
            
        }
        

        try {
            int cnt = 0;
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            while (true) {
                
                
                String line = reader.readLine();
                if (line == null) {
                    break;
                }
                String[] parts = line.split(",");
                
               
                if (!data.containsKey(parts[5])) {
                    data.put(parts[5], new ArrayList<Accelerometer>());
                }
                Accelerometer acc = new Accelerometer(Double.parseDouble(parts[2]), Double.parseDouble(parts[3]), Double.parseDouble(parts[4]));
                data.get(parts[5]).add(acc);
                cnt++;
                //System.out.println(cnt++);                
            }

            System.out.println("finishing reding file " + cnt);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return data;
    }

    public static TreeMap<String, List<Accelerometer>> LoadData(String input1, String input2) throws IOException {

        TreeMap<String, List<Accelerometer>> data = new TreeMap<String, List<Accelerometer>>();

        try {
            int cnt = 0;
            BufferedReader reader = new BufferedReader(new FileReader(input1));
            while (true) {
                String line = reader.readLine();
                if (line == null) {
                    break;
                }
                String[] parts = line.split(",");
                if (!data.containsKey("watch")) {
                    data.put("watch", new ArrayList<Accelerometer>());
                }
                Accelerometer acc = new Accelerometer(Double.parseDouble(parts[2]), Double.parseDouble(parts[3]), Double.parseDouble(parts[4]), Long.parseLong(parts[0]));
                data.get("watch").add(acc);
                cnt++;
                //System.out.println(cnt++);                
            }

            cnt = 0;
            BufferedReader reader2 = new BufferedReader(new FileReader(input2));
            while (true) {
                String line = reader2.readLine();
                if (line == null) {
                    break;
                }
                String[] parts = line.split(",");
                if (!data.containsKey("mobile")) {
                    data.put("mobile", new ArrayList<Accelerometer>());
                }
                Accelerometer acc = new Accelerometer(Double.parseDouble(parts[2]), Double.parseDouble(parts[3]), Double.parseDouble(parts[4]), Long.parseLong(parts[0]));
                data.get("mobile").add(acc);
                cnt++;
                //System.out.println(cnt++);                
            }

            System.out.println("finishing reding file " + cnt);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return data;
    }

    public static List<Accelerometer> getAccListByFile(String input) throws IOException {

        List<Accelerometer> data = new ArrayList<Accelerometer>();

        try {
            int cnt = 0;
            BufferedReader reader = new BufferedReader(new FileReader(input));
            while (true) {
                String line = reader.readLine();
                if (line == null) {
                    break;
                }
                String[] parts = line.split(",");

                Accelerometer acc = new Accelerometer(Double.parseDouble(parts[2]), Double.parseDouble(parts[3]), Double.parseDouble(parts[4]), Long.parseLong(parts[0]));
                data.add(acc);
                cnt++;
                //System.out.println(cnt++);                
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return data;
    }

}
