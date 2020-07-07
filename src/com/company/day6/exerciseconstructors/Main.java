package com.company.day6.exerciseconstructors;

public class Main {
    public static void main(String[] args) {
        //this one calls constructor that only takes the brand
        //maxcapacitycupsofcoffee and nr of legs are not specified, and remain 0
        CoffeeTable c1 = new CoffeeTable("IKEA");
        //this one calls constructor capacity coffee and brand, nr of legs are not specified
        //remain 0
        CoffeeTable c2 = new CoffeeTable(12, "Maison du monde");
        //this constructor sets all three fields, specifying everything
        CoffeeTable c3 = new CoffeeTable(16, "farelas", 1);

    }
}
