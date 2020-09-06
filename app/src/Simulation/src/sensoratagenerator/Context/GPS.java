/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sensoratagenerator.Context;

/**
 *
 * @author DELL
 */
public class GPS extends Context {

    private double latitude;
    private double longitude;    
    private double altitude;

    public GPS(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }
  
    public GPS(long timeStamp,String src, double latitude, double longitude, double altitude, String startDate,String endDate) {
        super.setSource(src);
        super.setTimeStamp(timeStamp);
        this.latitude = latitude;
        this.longitude = longitude;
        this.altitude = altitude;
    }
    
     public GPS(long timeStamp, double latitude, double longitude, double altitude) {
        super.setTimeStamp(timeStamp);
        this.latitude = latitude;
        this.longitude = longitude;
        this.altitude = altitude;
    }
    
    public GPS(double latitude, double longitude, double altitude) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.altitude = altitude;
    }
    
    public GPS(double latitude, double longitude, double altitude, String startDate,String endDate) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.altitude = altitude;
    }

    
     
    /**
     * Get the value of altitude
     *
     * @return the value of altitude
     */
    public double getAltitude() {
        return altitude;
    }

    /**
     * Set the value of altitude
     *
     * @param altitude new value of altitude
     */
    public void setAltitude(long altitude) {
        this.altitude = altitude;
    }


    /**
     * Get the value of longitude
     *
     * @return the value of longitude
     */
    public double getLng() {
        return longitude;
    }

    /**
     * Set the value of longitude
     *
     * @param lng new value of longitude
     */
    public void setLng(long lng) {
        this.longitude = lng;
    }

    /**
     * Get the value of latitude
     *
     * @return the value of latitude
     */
    public double getLat() {
        return latitude;
    }

    /**
     * Set the value of latitude
     *
     * @param lat new value of latitude
     */
    public void setLat(long lat) {
        this.latitude = lat;
    }

}
