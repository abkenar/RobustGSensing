/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sensoratagenerator.Sensors;

/**
 *
 * @author abakhshandehabk
 */
public class Accelerometer extends Sensor {

    private double x;
    private double y;
    private double z;
    private long timeStamp;
    private String dateTime;
    private String pace;

//    public Accelerometer(double x, double y, double z, long timeStamp, String dateTime) {
//        this.x = x;
//        this.y = y;
//        this.z = z;
//        this.timeStamp = timeStamp;
//        this.dateTime = dateTime;
//    }

    public Accelerometer(double x, double y, double z, long timeStamp) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.timeStamp = timeStamp;
    }

    public Accelerometer(double x, double y, double z, long timeStamp, String pace) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.timeStamp = timeStamp;
        this.pace=pace;
    }

    public Accelerometer(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Accelerometer(int frequency) {
        super.setFrequency(frequency);
    }

    /**
     * @return the x
     */
    public double getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public double getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(double y) {
        this.y = y;
    }

    /**
     * @return the z
     */
    public double getZ() {
        return z;
    }

    /**
     * @param z the z to set
     */
    public void setZ(double z) {
        this.z = z;
    }

    /**
     * @return the timeStamp
     */
    public long getTimeStamp() {
        return timeStamp;
    }

    /**
     * @param timeStamp the timeStamp to set
     */
    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getPace() {
        return pace;
    }

    public void setPace(String pace) {
        this.pace = pace;
    }
    

}
