package com.company.day8.abstractandinterfaces;

public interface Predator {
    void searchPrey();
    void catchPrey();

    //methods in interfaces can only have a body when they are static of default
        default void eat() {
        System.out.println("im eating ");
    }

    static void eatPreyStatically(Prey prey){
        System.out.println("static eating");
    }

    //A
    //make static calculate calories in prey
    //make a default method eat in both prey and predator
    //solve any conflicts that may arise (if nothing arises, you're doing something wrong)
    //call them from the main

    //B
    //default method to charge vehicle
    //static method to calculate charging costs
}
