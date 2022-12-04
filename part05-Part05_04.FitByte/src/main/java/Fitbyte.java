/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author plainsailing66
 */
public class Fitbyte {
    private int age;
    private int restingHeartRate;
    
    public Fitbyte(int age, int rHR) {
        this.age = age;
        this.restingHeartRate = rHR;
    }

    public double targetHeartRate(double percentageOfMaximum) {
        return (206.3 - (0.711 * age) - this.restingHeartRate) * percentageOfMaximum + this.restingHeartRate;
    }
}
