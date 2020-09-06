/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sensordatagenerator.Model;

import java.util.ArrayList;
import java.util.List;
import sensoratagenerator.Context.Context;

/**
 *
 * @author DELL
 */
public class Individual {

    String name;
    List<Context> userContexts;
    Gender gender;
    int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public enum Gender {
        male,
        female,;

    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Individual(String name, List<Context> userContexts) {
        this.name = name;
        this.userContexts = userContexts;
    }

    public Individual(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Context> getUserContexts() {
        return userContexts;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUserContexts(List<Context> userContexts) {
        this.userContexts = userContexts;
    }

}
