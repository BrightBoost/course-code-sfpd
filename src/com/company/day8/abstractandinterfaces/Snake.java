package com.company.day8.abstractandinterfaces;

public class Snake extends Animal implements Predator {
    public Snake(String name){
        super(name);
    }

    @Override
    public void eat(){
        System.out.println("swallow and wait");
    }

    //annotation, starts with @
    //annotation adds a certain behavior / functionality / compilation check
    @Override
    public void catchPrey() {
        System.out.println("sneaking up on prey...");
    }


    public void eatPrey(Prey mouse){
        System.out.println("bye micky");
    }

    public void searchPrey() {
        System.out.println("just gliding around, looking for mice");
    }
}
