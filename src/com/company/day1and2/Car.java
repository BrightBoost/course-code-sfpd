package com.company.day1and2;

public class Car extends Vehicle {
    private String licensePlate;
    private boolean convertible;

    //public/private etc + whatever the method sends back
    // + name of the method
    // + () + that might contain input params
    public String honkSound(){
        System.out.println(licensePlate);
        return "toettoet";

    }

    public void honk(){
        System.out.println("toettoettoet");
     }

    //method makes annoying sound when someone is not wearing the seatbelt
    public void annoy() {
        System.out.println("beep beep beep");
    }

    public void annoyWithSpecificSound(String annoyingSound, int i){
        System.out.println(i + " times " + annoyingSound);
    }

    //getters and setters
    public String getLicensePlate(){
        return this.licensePlate;
    }

    public void setLicensePlate(String licensePlate){

        this.licensePlate = licensePlate;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }
}
