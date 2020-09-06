/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sensoratagenerator.Sensors;

import sensoratagenerator.Context.Context;

/**
 *
 * @author DELL
 */
public class HeartRate extends Sensor {

    private long timeStamp;
    private int hr;

    public HeartRate(long timeStamp, int hr) {
        this.timeStamp = timeStamp;
        this.hr = hr;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public int getHr() {
        return hr;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public void setHr(int hr) {
        this.hr = hr;
    }

}
