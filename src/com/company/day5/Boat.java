package com.company.day5;


public class Boat {
    private int maxSpeed;
    public Boat(int max) {
        maxSpeed = max;
    }

    public Boat(){
// constructor without parameter, initialises nothing
    // return code nothing
        // same name as class , majuscule
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
