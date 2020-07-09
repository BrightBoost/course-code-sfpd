package com.company.day8.abstractandinterfaces;

public class Dog extends Mammal {
    public Dog(String name){
        super(name);
    }

    public void eat(){
        System.out.println("dog is eating");
    }


    //this is not allowed, because dog is not abstract
    //public abstract void iDontKnow();
}
