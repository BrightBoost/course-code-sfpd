package com.company.day10.runneruptopic;

public class Baby {
    private static int age = 0;

    public static int getAge(){
        return age;
    }

    public static void goShoppingForBaby(){
        //no instance needed to go shopping for the baby
    }

    public void feedBaby(){
        //you need an instance in order to be able to do this
    }
}
