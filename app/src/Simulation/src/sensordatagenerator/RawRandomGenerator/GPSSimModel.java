/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sensordatagenerator.RawRandomGenerator;

import java.util.List;
import sensoratagenerator.Context.GPS;
import sensordatagenerator.Activity.Activity;
import sensordatagenerator.Model.*;

/**
 *
 * @author DELL
 */
public class GPSSimModel {

    private Location initialGPSCoordinate;
    private Route wayPoints;
    private Individual individual;
    private List<Individual> group;
    private List<Car> car;
    private Activity.ActivityName movementSpeed;
    private String startTime;
    private String endTime;
    private boolean threadRunning;

    public boolean isThreadRunning() {
        return threadRunning;
    }

    public void setGroup(List<Individual> group) {
        this.group = group;
    }

    public void setThreadRunning(boolean threadRunning) {
        this.threadRunning = threadRunning;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public GPSSimModel(Location initialGPSCoordinate, Route wayPoints, Individual individual, Activity.ActivityName movementSpeed) {
        this.initialGPSCoordinate = initialGPSCoordinate;
        this.wayPoints = wayPoints;
        this.individual = individual;
        this.movementSpeed = movementSpeed;
    }

    public GPSSimModel(Location initialGPSCoordinate, Route wayPoints, List<Individual> group, Activity.ActivityName movementSpeed) {
        this.initialGPSCoordinate = initialGPSCoordinate;
        this.wayPoints = wayPoints;
        this.group = group;
        this.movementSpeed = movementSpeed;
    }

    public GPSSimModel(Location initialGPSCoordinate, Route wayPoints, List<Individual> group, Activity.ActivityName movementSpeed, String startTime, String endTime) {
        this.initialGPSCoordinate = initialGPSCoordinate;
        this.wayPoints = wayPoints;
        this.group = group;
        this.movementSpeed = movementSpeed;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public GPSSimModel(Location initialGPSCoordinate, Route wayPoints, Individual individual, Activity.ActivityName movementSpeed, String startTime, String endTime) {
        this.initialGPSCoordinate = initialGPSCoordinate;
        this.wayPoints = wayPoints;
        this.individual = individual;
        this.movementSpeed = movementSpeed;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Location getInitialGPSCoordinate() {
        return initialGPSCoordinate;
    }

    public Route getWayPoints() {
        return wayPoints;
    }

    public Individual getIndividual() {
        return individual;
    }

    public List<Individual> getGroup() {
        return group;
    }

    public Activity.ActivityName getMovementSpeed() {
        return movementSpeed;
    }

    public void setInitialGPSCoordinate(Location initialGPSCoordinate) {
        this.initialGPSCoordinate = initialGPSCoordinate;
    }

    public void setWayPoints(Route wayPoints) {
        this.wayPoints = wayPoints;
    }

    public void setIndividual(Individual individual) {
        this.individual = individual;
    }

    public void setIndividuals(List<Individual> group) {
        this.group = group;
    }

    public void setMovementSpeed(Activity.ActivityName movementSpeed) {
        this.movementSpeed = movementSpeed;
    }

}
