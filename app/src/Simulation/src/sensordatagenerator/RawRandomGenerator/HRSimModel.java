/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sensordatagenerator.RawRandomGenerator;

import java.util.List;
import sensordatagenerator.Activity.Activity;
import sensordatagenerator.Model.Individual;

/**
 *
 * @author DELL
 */
public class HRSimModel {

    private Individual individual;
    private List<Individual> group;
    private String startTime;
    private String endTime;
    private Activity activity;

    public HRSimModel(List<Individual> group, Activity activity) {
        this.group = group;
        this.activity = activity;
    }

    public HRSimModel(List<Individual> group, Activity activity, String startTime, String endTime) {
        this.group = group;
        this.startTime = startTime;
        this.endTime = endTime;
        this.activity = activity;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Individual getIndividual() {
        return individual;
    }

    public List<Individual> getGroup() {
        return group;
    }

    public void setIndividual(Individual individual) {
        this.individual = individual;
    }

    public void setGroup(List<Individual> group) {
        this.group = group;
    }

}
