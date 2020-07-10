package com.company.day8.abstractandinterfaces;

public class Cat extends Mammal implements Predator, Prey {

    public Cat(String name){
        super(name);
    }


    public void eat(){
        System.out.println("cat is eating");
    }

    @Override
    public void searchPrey() {
        System.out.println("cat is searching");
    }

    @Override
    public void catchPrey() {
        System.out.println("cat is catching");
    }

    @Override
    public void eatPrey(Prey prey) {
        System.out.println("cat is eating");
    }

    @Override
    public void runAndHide() {
        System.out.println("run and hide");
    }

    @Override
    public void noticePredators() {
        System.out.println("notice predators");
    }
}
