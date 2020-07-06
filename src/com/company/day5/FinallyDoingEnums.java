package com.company.day5;

import com.company.day4.Gym;

public class FinallyDoingEnums {
    public static void main(String[] args) {
        Color c1 = Color.BLUE;
        Color c2 = Color.YELLOW;
        System.out.println(c1);
        System.out.println(c1.ordinal());
        System.out.println(c1.getDescription());
        //in your project
        //change type of brand Car from String to enum brand
        //or create a new car
        //create an enum brand
        //from a main, give your Car a value for brand
        if(c1.equals(c2)){
            System.out.println("same");
        } else  {
            System.out.println("different");
        }

        switch (c2){
            case BLUE:
                System.out.println("aaah blue");
                break;
            case YELLOW:
                System.out.println("yellow");
                break;
            case GREEN:
                System.out.println("green");
                break;
            case PURPLE:
                System.out.println("purple");
                break;
        }
    }
}
