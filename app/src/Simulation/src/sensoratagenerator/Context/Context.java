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
public class Context {

    private ContextName name;
    private String source;
    private long timeStamp;
    private String dateTime;

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

    public enum ContextName {
        GPS,
        Velocity,
    }

    public ContextName getName() {
        return name;
    }

    public String getSource() {
        return source;
    }

    public void setName(ContextName name) {
        this.name = name;
    }

    public void setSource(String source) {
        this.source = source;
    }

}
