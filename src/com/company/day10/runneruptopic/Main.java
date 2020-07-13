package com.company.day10.runneruptopic;

public class Main {
    public static void main(String[] args) {
        Baby baby = new Baby();
        baby.feedBaby();

        //two ways to call the static method
        //the method they call is exactly the same
        //on the instance
        baby.goShoppingForBaby();
        baby.getAge();
        //on the class
        Baby.goShoppingForBaby();
        Baby.getAge();
    }
}
