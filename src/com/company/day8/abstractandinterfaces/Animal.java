package com.company.day8.abstractandinterfaces;

//animal is too generic
//using the abstract keyword on a class prevents the class from being instantiated
//so you cannot say new Animal() anymore now

//two things with abstract classes
//- they cannot be instantiated
//- they can contain abstract methods, abstract methods they don't have a body / implementation
public abstract class Animal {
    private String name;
    private double weight;

    //because its abstract, there is no body, so no { and }, but a ; instead
    //child classes that are not abstract, must implement this method
    public abstract void eat();

    public Animal(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
