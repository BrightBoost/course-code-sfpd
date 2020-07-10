package com.company.day8.abstractandinterfaces;

public class Mouse extends Mammal implements Prey {

    public Mouse(String name){
        super(name);
    }

    @Override
    public void eat(){
        System.out.println("mouse is eating");
    }

    @Override
    public void runAndHide(){
        System.out.println("run and hide, mouse");
    }

    @Override
    public void noticePredators(){
        System.out.println("listening carefully");
    }
}
