/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sensordatagenerator.RawRandomGenerator;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import sensoratagenerator.Context.GPS;
import sensoratagenerator.Sensors.Accelerometer;
import sensordatagenerator.Model.Individual;
import static sensordatagenerator.RawRandomGenerator.GPSDataGenerator.ARRIVAL_RADIUS_IN_KM;
import static sensordatagenerator.RawRandomGenerator.GPSDataGenerator.SIMULATOR_MOVEMENT_SPEED;
import static sensordatagenerator.RawRandomGenerator.GPSDataGenerator.generateNearbyLocation;
import static sensordatagenerator.RawRandomGenerator.GPSDataGenerator.generateNextTimeStamp;
import static sensordatagenerator.RawRandomGenerator.GlobaModelHelper.generatedGPSDataAll;
import static sensordatagenerator.RawRandomGenerator.RawRandomGenerator.generateAccelerometerData;
import sensordatagenerator.Utils.DateTime;

/**
 *
 * @author DELL
 */
public class GPSDataGeneratorThread extends Thread {

    Individual individula;
    Route simulatedRoute;
    Location currentLocation;
    boolean threadRunning = true;
    long starTime;
    long endTime;
    long nextTimeStamp;
    GPSSimModel gpsModelCons;
    int waypointCounter = 0;

    public GPSDataGeneratorThread(GPSSimModel gpsModelCons) {
        this.gpsModelCons = gpsModelCons;
        currentLocation = new Location("currentLocation", gpsModelCons.getInitialGPSCoordinate().getLatitude(), gpsModelCons.getInitialGPSCoordinate().getLongitude());
        simulatedRoute = gpsModelCons.getWayPoints();

    }

    public GPSDataGeneratorThread(Individual individula, GPSSimModel gpsModelCons) throws ParseException {
        this.individula = individula;
        this.gpsModelCons = gpsModelCons;
        currentLocation = new Location("currentLocation", gpsModelCons.getInitialGPSCoordinate().getLatitude(), gpsModelCons.getInitialGPSCoordinate().getLongitude());
        simulatedRoute = gpsModelCons.getWayPoints();
        starTime = DateTime.getTimeStampByTimeDate(gpsModelCons.getStartTime(), false);
        endTime = DateTime.getTimeStampByTimeDate(gpsModelCons.getEndTime(), false);
        nextTimeStamp = starTime;
        this.gpsModelCons.setThreadRunning(true);
    }

    public void move() {

        //System.out.println(individula.getName()+" is walking");
        Location nextWaypoint = simulatedRoute.waypoints[waypointCounter];
        if (GeoHelper.calcGeoDistanceInKm(currentLocation, nextWaypoint) < ARRIVAL_RADIUS_IN_KM) {
            waypointCounter++;
            if (waypointCounter > simulatedRoute.waypoints.length - 1) {
                currentLocation = new Location("currentLocation", gpsModelCons.getInitialGPSCoordinate().getLatitude(), gpsModelCons.getInitialGPSCoordinate().getLongitude());
                waypointCounter = 0;
            }
            nextWaypoint = simulatedRoute.waypoints[waypointCounter];
        }
        //System.out.println("Moving to " + nextWaypoint.name + ". Distance = " + GeoHelper.calcGeoDistanceInKm(currentLocation, nextWaypoint) * 1000 + "m");
        double angle = GeoHelper.calcAngleBetweenGeoLocationsInRadians(currentLocation, nextWaypoint);
        double newLat = currentLocation.latitude + Math.sin(angle) * SIMULATOR_MOVEMENT_SPEED;
        double newLon = currentLocation.longitude + Math.cos(angle) * SIMULATOR_MOVEMENT_SPEED;

        double[] foundLoc = generateNearbyLocation(newLat, newLon, 1); //i meter radius 
        newLat = foundLoc[1];
        newLon = foundLoc[0];

        System.out.println(GeoHelper.calcGeoDistanceInKm(new Location("generated", newLat, newLon), new Location("target", simulatedRoute.waypoints[simulatedRoute.waypoints.length - 1].getLatitude(), simulatedRoute.waypoints[simulatedRoute.waypoints.length - 1].getLongitude())) * 1000);

        //construct GPS model to be saved in generatedGPSDataAll
        GPS gpsData=new GPS(nextTimeStamp, newLat, newLon, 0);
        
//        if (GeoHelper.calcGeoDistanceInKm(new Location("generated", newLat, newLon), new Location("target", simulatedRoute.waypoints[simulatedRoute.waypoints.length - 1].getLatitude(), simulatedRoute.waypoints[simulatedRoute.waypoints.length - 1].getLongitude())) * 1000 < 8) {
//            threadRunning = false;
//        }

        //adds geenrated GPS data into model 
        if (!generatedGPSDataAll.containsKey(individula.getName())) {
            generatedGPSDataAll.put(individula.getName(), new ArrayList<GPS>());
        }
        generatedGPSDataAll.get(individula.getName()).add(gpsData);

        
        System.out.println(String.valueOf(newLat) + "," + String.valueOf(newLon) + " From " + individula.getName() + " at: " + DateTime.getDateByTimestamp(nextTimeStamp, false) + " **** " + String.valueOf(GeoHelper.calcGeoDistanceInKm(currentLocation, new Location("newloc", newLat, newLon)) * 1000) + "m");
        currentLocation = new Location("currentLocation", newLat, newLon);

        //generate next timeStamp 
        nextTimeStamp = generateNextTimeStamp(nextTimeStamp, GPSDataGenerator.getFreqOfGeneratedGPS());
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        super.run();

        while (threadRunning) {
            move();

            try {
                Thread.sleep((long) (1000 * GPSDataGenerator.getFreqOfGeneratedGPS()));
                //Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(RawRandomGenerator.class.getName()).log(Level.SEVERE, null, ex);
            }
            //check if thread has finished
            if (nextTimeStamp > endTime) {
                threadRunning = false;
                System.out.println("Thread " + individula.getName() + " finished");
            }
        }
    }
}
