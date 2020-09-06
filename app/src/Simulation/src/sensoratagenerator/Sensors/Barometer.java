/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sensoratagenerator.Sensors;

/**
 *
 * @author DELL
 */
public class Barometer extends Sensor{
    
    private double val;
    private long timeStamp;
    private String dateTime;

    public Barometer(double val, long timeStamp, String dateTime) {
        this.val = val;
        this.timeStamp = timeStamp;
        this.dateTime = dateTime;
    }

    public Barometer(double val, long timeStamp) {
        this.val = val;
        this.timeStamp = timeStamp;
    }
    

    public double getVal() {
        return val;
    }

    public void setVal(double val) {
        this.val = val;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public String getDateTime() {
        return dateTime;
    }
    
    
}
