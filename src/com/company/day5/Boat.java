package com.company.day5;

public class Boat {
    private int maxSpeed;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Boat(int max){
        maxSpeed = max;
    }

    public Boat(){
        System.out.println("im in the empty constructor");
    }
}
