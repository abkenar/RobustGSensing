/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sensordatagenerator.Activity;

import java.util.List;
import sensoratagenerator.Sensors.Sensor;

/**
 *
 * @author abakhshandehabk
 */
public class Activity {

    public enum ActivityPace {
        slow,
        fast,
        normal,
    }

    public enum ActivityName {
        TableTennis,
        onBus,
        onTrain,
        walking,
        jogging,
        running,
        cycling,
        standing,
        Stationary,
        PickingCherry,
        eating,
        goingUpHill,
        goingDownHill,
    }

    public Activity(ActivityName name, String start_time, String end_time, ActivityPace pace, String performedBy) {
        this.name = name;
        this.start_time = start_time;
        this.end_time = end_time;
        this.pace = pace;
        this.performedBy = performedBy;
    }

    public Activity(ActivityName name, String performedBy) {
        this.name = name;
        this.performedBy = performedBy;
    }

    public Activity(ActivityName name) {
        this.name = name;
    }
    
    
    
    

    private ActivityName name;
    private String start_time;
    private String end_time;
    private ActivityPace pace;
    private String performedBy;
    private List<Sensor> usedSensors;

    public void setUsedSensors(List<Sensor> usedSensors) {
        this.usedSensors = usedSensors;
    }

    public List<Sensor> getUsedSensors() {
        return usedSensors;
    }

    public ActivityName getName() {
        return name;
    }

    public String getPerformedBy() {
        return performedBy;
    }

    public void setName(ActivityName name) {
        this.name = name;
    }

    public void setPerformedBy(String performedBy) {
        this.performedBy = performedBy;
    }

    public String getStart_time() {
        return start_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public void setEnd_time(String end_time) { 
        this.end_time = end_time;
    }

    public ActivityPace getPace() {
        return pace;
    }

    public int getPaceValue() {

        switch (pace) {
            case slow:
                return 0;
            case normal:
                return 1;
            case fast:
                return 2;
        }

        return -1;
    }

    public int getAtomicActivityLabelValue() {

        switch (name) {
            case onBus:
                return 1;
            case walking:
                return 1;
            case running:
                return 3;
            case Stationary:
                return 4;
            case onTrain:
                return 5;
            case cycling:
                return 5;
        }

        return -1;
    }

    public void setPace(ActivityPace pace) {
        this.pace = pace;
    }

}
