package com.company.day5;

public class explainingConstructor {
    public static void main(String[] args) {
        Boat b1 = new Boat();
        Boat b2 = new Boat(44);

        System.out.println(b1.getMaxSpeed());
        System.out.println(b2.getMaxSpeed());
    }

}
