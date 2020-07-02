package com.company.day4;

import com.company.day1and2.Facility;

import java.util.ArrayList;
import java.util.List;

public class Gym {
    private List<Facility> facilities = new ArrayList<>();

    public List<Facility> getFacilities() {
        return facilities;
    }

    public void setFacilities(List<Facility> facilities) {
        this.facilities = facilities;
    }

    public void addFacility(int maxCapacity, String name, boolean open){
        Facility f = new Facility();
        f.setName(name);
        f.setMaxCapacity(maxCapacity);
        f.setOpen(open);

        this.facilities.add(f);
    }

    //this is called overloading
    //two methods with the same name, but different parameter list
    public void addFacility(Facility f){
        this.facilities.add(f);
    }
}
