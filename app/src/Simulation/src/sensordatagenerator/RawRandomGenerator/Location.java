/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sensordatagenerator.RawRandomGenerator;

import java.text.ParseException;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import static sensordatagenerator.RawRandomGenerator.GeoHelper.calcGeoDistanceInKm;
import sensordatagenerator.Utils.DateTime;

/**
 *
 * @author DELL
 */

public class Location {

    public String name;
    public double latitude;
    public double longitude;

    public Location(String name, double latitude, double longitude) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getName() {
        return name;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
    
    
}


class GeoHelper {

    public static boolean threadRunning=true;
    
    public static final double EARTH_RADIUS_IN_KM = 6.371;

    public static double calcGeoDistanceInKm(double lat1, double lat2, double lon1, double lon2) {
        double dlat = Math.abs(lat1 - lat2);
        double dlon = Math.abs(lon1 - lon2);
        double a = Math.pow((Math.sin(dlat / 2)), 2) + Math.cos(lat1) * Math.cos(lat2) * Math.pow((Math.sin(dlon / 2)), 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        return EARTH_RADIUS_IN_KM * c;
    }

    public static double distance1(double lat1, double lat2, double lon1,
            double lon2, double el1, double el2) {

        final int R = 6371; // Radius of the earth

        double latDistance = Math.toRadians(lat2 - lat1);
        double lonDistance = Math.toRadians(lon2 - lon1);
        double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
                + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2))
                * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double distance = R * c * 1000; // convert to meters

        double height = el1 - el2;

        distance = Math.pow(distance, 2) + Math.pow(height, 2);

        return Math.sqrt(distance);
    }

    public static final double distance(double lat1, double lon1, double lat2, double lon2, char unit) {
        double theta = lon1 - lon2;
        double dist = Math.sin(deg2rad(lat1)) * Math.sin(deg2rad(lat2)) + Math.cos(deg2rad(lat1)) * Math.cos(deg2rad(lat2)) * Math.cos(deg2rad(theta));
        dist = Math.acos(dist);
        dist = rad2deg(dist);
        dist = dist * 60 * 1.1515;

        if (unit == 'K') {
            dist = dist * 1.609344;
        } else if (unit == 'N') {
            dist = dist * 0.8684;
        }

        return (dist);
    }

    /**
     * <p>
     * This function converts decimal degrees to radians.</p>
     *
     * @param deg - the decimal to convert to radians
     * @return the decimal converted to radians
     */
    private static final double deg2rad(double deg) {
        return (deg * Math.PI / 180.0);
    }

    /**
     * <p>
     * This function converts radians to decimal degrees.</p>
     *
     * @param rad - the radian to convert
     * @return the radian converted to decimal degrees
     */
    private static final double rad2deg(double rad) {
        return (rad * 180 / Math.PI);
    }

    public static double distFrom(double lat1, double lng1, double lat2, double lng2) {
        double earthRadius = 6371000; //meters
        double dLat = Math.toRadians(lat2 - lat1);
        double dLng = Math.toRadians(lng2 - lng1);
        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2)
                + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2))
                * Math.sin(dLng / 2) * Math.sin(dLng / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double dist = earthRadius * c;

        return dist;
    }

    public static double calcGeoDistanceInKm(Location location1, Location location2) {
        //return calcGeoDistanceInKm(location1.latitude, location2.latitude, location1.longitude, location2.longitude);
        //return distFrom(location1.latitude, location2.latitude, location1.longitude, location2.longitude);
        return distance(location1.latitude, location1.longitude, location2.latitude, location2.longitude, 'K');
    }

    public static double calcAngleBetweenGeoLocationsInRadians(double lat1, double lat2, double lon1, double lon2) {
        double dlat = lat2 - lat1;
        double dlon = lon2 - lon1;
        double angle = (Math.atan2(dlat, dlon) * 180) / Math.PI;
        return Math.toRadians(angle);
    }

    public static double calcAngleBetweenGeoLocationsInRadians(Location location1, Location location2) {
        return calcAngleBetweenGeoLocationsInRadians(location1.latitude, location2.latitude, location1.longitude, location2.longitude);
    }

}

