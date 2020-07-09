package com.company.day8.abstractandinterfaces;

public class Cat extends Mammal {

    public Cat(String name){
        super(name);
    }

    public void eat(){
        System.out.println("cat is eating");
    }
}
