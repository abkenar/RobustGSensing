/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sensoratagenerator.Sensors;

/**
 *
 * @author abakhshandehabk
 */
public class AccelerometerCombined extends Sensor {

    private double xMobile;
    private double yMobile;
    private double zMobile;

    private double xWatch;
    private double yWatch;
    private double zWatch;

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
    public AccelerometerCombined(double xWatch, double yWatch, double zWatch, double xMobile, double yMobile, double zMobile, long timeStamp) {
        this.xMobile = xMobile;
        this.yMobile = yMobile;
        this.zMobile = zMobile;
        this.xWatch = xWatch;
        this.yWatch = yWatch;
        this.zWatch = zWatch;
        this.timeStamp = timeStamp;
    }

    public AccelerometerCombined(double xMobile, double yMobile, double zMobile, double xWatch, double yWatch, double zWatch, String pace) {
        this.xMobile = xMobile;
        this.yMobile = yMobile;
        this.zMobile = zMobile;
        this.xWatch = xWatch;
        this.yWatch = yWatch;
        this.zWatch = zWatch;
        this.timeStamp = timeStamp;
        this.pace = pace;
    }

    public AccelerometerCombined(double xMobile, double yMobile, double zMobile, double xWatch, double yWatch, double zWatch) {
        this.xMobile = xMobile;
        this.yMobile = yMobile;
        this.zMobile = zMobile;
        this.xWatch = xWatch;
        this.yWatch = yWatch;
        this.zWatch = zWatch;
    }

    public double getxMobile() {
        return xMobile;
    }

    public double getyMobile() {
        return yMobile;
    }

    public double getzMobile() {
        return zMobile;
    }

    public double getxWatch() {
        return xWatch;
    }

    public double getyWatch() {
        return yWatch;
    }

    public double getzWatch() {
        return zWatch;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public String getDateTime() {
        return dateTime;
    }

    public String getPace() {
        return pace;
    }

    public void setxMobile(double xMobile) {
        this.xMobile = xMobile;
    }

    public void setyMobile(double yMobile) {
        this.yMobile = yMobile;
    }

    public void setzMobile(double zMobile) {
        this.zMobile = zMobile;
    }

    public void setxWatch(double xWatch) {
        this.xWatch = xWatch;
    }

    public void setyWatch(double yWatch) {
        this.yWatch = yWatch;
    }

    public void setzWatch(double zWatch) {
        this.zWatch = zWatch;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public void setPace(String pace) {
        this.pace = pace;
    }

    /**
     * @return the x
     */
}
