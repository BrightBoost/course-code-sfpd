package com.company.day3;

public class Vacuumcleaner {
    public void vacuum(Address address){
        System.out.println("vacuum noise, to clean the house at " + address.getCity() + " " + address.getStreetName() + " " + address.getNr());
    }
}
