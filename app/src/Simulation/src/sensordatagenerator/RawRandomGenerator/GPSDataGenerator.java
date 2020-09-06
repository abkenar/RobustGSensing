/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sensordatagenerator.RawRandomGenerator;

import java.text.ParseException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import sensordatagenerator.Model.Individual;
import static sensordatagenerator.RawRandomGenerator.RawRandomGenerator.freqOfGeneratedWatch;
import sensordatagenerator.Utils.DateTime;
import static sensordatagenerator.Utils.DateTime.getTimeStampByTimeDate;

/**
 *
 * @author DELL
 */
public class GPSDataGenerator {

//    public static final double initialLatitude = -37.7024212;
//    public static final double initialLongitude = 145.044288;
    public static Double freqOfGeneratedGPS;
    //0.000009806 works for 1 meter as baseline
    //public static final double SIMULATOR_MOVEMENT_SPEED = 0.0001670; // 0.00007894 17 meter (which is equals to 10 seconds normal walking)
    
    //if a car move 70km/h ==> distanced 0.019 km/s
    public static final double SIMULATOR_MOVEMENT_SPEED = 0.0019647058; // 0.00007894 17 meter (which is equals to 10 seconds normal walking)
    
    // 0.00007894 8 meter (which is equals to 5 seconds normal walking) // 0.000015; // ~0.05m - 0.1m per step
    public static final double ARRIVAL_RADIUS_IN_KM = 0.05 / 1000;  // 0.05m

    public static void setFreqOfGeneratedGPS(double freq) {
        freqOfGeneratedGPS = freq;
    }

    public static double getFreqOfGeneratedGPS() {
        return freqOfGeneratedGPS;
    }

    public List<GPSSimModel> gpsModelList;
    List<GPSDataGeneratorThread> gpsThreadList;
    Map<String, GPSDataGeneratorThread> gpsThreadMap = new HashMap<>();

//    public Route simulatedRoute = new Route(
//            new Location("Waypoint 1", -37.7029661, 145.0437927),
//            new Location("Waypoint 2", -37.7023437, 145.043515),
//            new Location("Waypoint 3", -37.7018563, 145.0430242),
//            new Location("Waypoint 4", -37.7012882, 145.0438619));
    //-37.701305, 145.0452429
    public static double[] generateNearbyLocation(double x0, double y0, int radius) {
        Random random = new Random();
        double[] foundLoc = {0, 0};
        // Convert radius from meters to degrees
        double radiusInDegrees = radius / 111000f;

        double u = random.nextDouble();
        double v = random.nextDouble();
        double w = radiusInDegrees * Math.sqrt(u);
        double t = 2 * Math.PI * v;
        double x = w * Math.cos(t);
        double y = w * Math.sin(t);

        // Adjust the x-coordinate for the shrinking of the east-west distances
        double new_x = x / Math.cos(Math.toRadians(y0));

        double foundLongitude = new_x + x0;
        double foundLatitude = y + y0;
        System.out.println("Longitude: " + foundLongitude + "  Latitude: " + foundLatitude);
        foundLoc[0] = foundLatitude;
        foundLoc[1] = foundLongitude;

        return foundLoc;
    }

    int threadCounter = 0;

    //this method  invioked from Driver Class 
    public void generateGPSData(List<GPSSimModel> gpsModelList) throws ParseException {
        this.gpsModelList = gpsModelList;
        gpsThreadList = new ArrayList<GPSDataGeneratorThread>();
        //GPSDataGeneratorThread gpsThread;
        GPSDataGeneratorThread gpsThread;

        for (int l = 0; l < gpsModelList.size(); l++) {
            // constrcut required threads 

            //for those cases which have group , this block create threads per each individula 
            if (gpsModelList.get(l).getGroup() != null) {
                for (int i = 0; i < gpsModelList.get(l).getGroup().size(); i++) {

                    gpsThread = new GPSDataGeneratorThread(gpsModelList.get(l).getGroup().get(i), gpsModelList.get(l));
                    //gpsThread.test(gpsModelList.get(l));
                    gpsThreadList.add(gpsThread);
                    //gpsThreadMap.put(gpsModelList.get(l).getStartTime(), gpsThread);
                }
            } else { //for individula only (not group creation)
                gpsThread = new GPSDataGeneratorThread(gpsModelList.get(l).getIndividual(), gpsModelList.get(l));
                gpsThreadList.add(gpsThread);
                //gpsThreadMap.put(gpsModelList.get(l).getStartTime(), gpsThread);
            }

        }

        GPSThreadListRunner gpsThreadListRunner = new GPSThreadListRunner(gpsThreadList);
        gpsThreadListRunner.start();
    }
//==================================================================================

    public static long generateNextTimeStamp(long time, double frequency) {

        String str1 = DateTime.getDateByTimestamp(time, false);

        long a = (long) (1000 / frequency);
         a = (long) (1000 * frequency);

        long LOWER_RANGE = (long) (0.1 * a) + a; //assign lower range value
        long UPPER_RANGE = (long) ((0.3 * a) + a); //assign upper range value
        Random random = new Random();

        long randomValue = LOWER_RANGE + (long) (random.nextDouble() * (UPPER_RANGE - LOWER_RANGE));

        //System.out.println("sssssssssssssssssssssss" + DateTime.getDateByTimestamp(randomValue + time, true));
        String str2 = DateTime.getDateByTimestamp(randomValue + time, false);

        System.out.println("before: " + str1 + "   after:" + str2);

        return randomValue + time;
    }

    //This model class helps to create list of threds as  
    public class GPSThreadModel {

    }
    
    public double  calcSimMovementSpeed(int vehicleVelocity)
    {
        //first calculate the cimmuted distance  in 1 second
        int oneSecondDistance = (vehicleVelocity/3600)*1000; 
        
        //Then according to GPS frequency (how often we want Sim ro generate data)
        int requiredDistanceByGPSFrequency =  (int) (oneSecondDistance* freqOfGeneratedGPS);
        
        //calc the coefficient for sim movement speed 
        //0.0001670  is the proper value for 17 meter
        return    (requiredDistanceByGPSFrequency*0.0001670)/17 ;
      
    }
}
