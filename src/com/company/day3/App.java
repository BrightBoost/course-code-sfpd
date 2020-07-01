package com.company.day3;

public class App {
    public static void main(String[] args) {
        //instance of address
        Address address = new Address();
        address.setStreetName("street something");
        address.setNr("2");
        address.setCity("brussels");
        address.setClean(false);
        //instance of person
        Person mrBlabla = new Person();
        mrBlabla.setAddress(address);
        mrBlabla.setAge(34);
        mrBlabla.setName("Mr Blabla");

        System.out.println(mrBlabla.getAddress().getCity());
        mrBlabla.cleanHouse();

        int x = 1;
        int y = 2;
        //write if statement for case where x < y and x > y

        if(x < y){
            System.out.println(x + " is smaller than second nr" + y);
        } else if(x > y) {
            System.out.println(x + " is bigger than second nr" + y);
        } else {
            System.out.println("numbers are equal " +x);
        }

        mrBlabla.getAddress().setClean(false);
        System.out.println("the house is clean: " + mrBlabla.getAddress().isClean());

        //not clean, busy
        if(!mrBlabla.getAddress().isClean() && mrBlabla.isBusy()) {
            System.out.println("i will clean the house as soon as i have time");
        }
        //not clean, not busy
        else if(!mrBlabla.getAddress().isClean() && !mrBlabla.isBusy()) {
            System.out.println("let's clean the house, i have time");
            mrBlabla.cleanHouse();
        }
        //clean, not busy
        else if(mrBlabla.getAddress().isClean() && !mrBlabla.isBusy()){
            System.out.println("hmm the house is clean, but i have nothing to do. Lets walk my pet");
        }
        //house clean and he is busy
        else {
            System.out.println("it's a good thing i've cleaned the house, because im very busy");
        }

        if(!mrBlabla.isBusy() || !mrBlabla.getAddress().isClean()){
            System.out.println("im going to clean the house");
        }


        System.out.println("the house is clean: " + mrBlabla.getAddress().isClean());


    }


}
