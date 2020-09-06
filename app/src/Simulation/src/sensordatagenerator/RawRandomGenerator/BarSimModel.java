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
public class BarSimModel {

    private Individual individual;
    private List<Individual> group;
    private String startTime;
    private String endTime;
    private GradientMode gradientMode;
    private double initHeight;

    public enum GradientMode {
        level1,
        level2,
        level3,
        level4,
        level5,
    }

    public BarSimModel(Individual individual, GradientMode gradientMode, String startTime, String endTime,double initHeight) {
        this.individual = individual;
        this.startTime = startTime;
        this.endTime = endTime;
        this.gradientMode = gradientMode;
        this.initHeight=initHeight;
    }

    public BarSimModel(List<Individual> group, GradientMode gradientMode, String startTime, String endTime,double initHeight) {
        this.group = group;
        this.startTime = startTime;
        this.endTime = endTime;
        this.gradientMode = gradientMode;
        this.initHeight=initHeight;
    }

    public Individual getIndividual() {
        return individual;
    }

    public List<Individual> getGroup() {
        return group;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public GradientMode getGradientMode() {
        return gradientMode;
    }

    public void setIndividual(Individual individual) {
        this.individual = individual;
    }

    public void setGroup(List<Individual> group) {
        this.group = group;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public void setGradientMode(GradientMode gradientMode) {
        this.gradientMode = gradientMode;
    }

}
