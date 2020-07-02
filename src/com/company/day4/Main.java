package com.company.day4;

import com.company.day1and2.Facility;

public class Main {
    public static void main(String[] args) {
        Gym gym = new Gym();
        Facility f = new Facility();
        f.setName("sauna");
        gym.addFacility(f);
        gym.addFacility(89,"big pool", false);

        for(Facility facility : gym.getFacilities()){
            System.out.println(facility.getName());
        }

    }
}
