package com.company.day5;


public class finallyDoingEnums {
    public static void main(String[] args) {
        Color c1 = Color.BLUE;
        Color c2 = Color.YELLOW;
        System.out.println(c1);
        System.out.println(c1.ordinal());
        System.out.println(c1.getDescription());

        // in your project
        //change type of brand Car from STring to enum Brand
        //create a enum brand
        //from a main, give your Car a value for brand

    //if (c1.equals(c2))

        switch (c2){
            case BLUE:
                System.out.println("BLUE");
                break;
            case YELLOW:
                System.out.println("YELLOW");
                break;
        }

        Car car1 = new Car();
        car1.setBrand(Brand.VOLKSWAGEN);
        System.out.println();

    }





}
