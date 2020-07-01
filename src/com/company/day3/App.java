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

        int x = 8;
        int y = 22;
        //write if statement for case where x < y and x > y

        if(5 < 3){
            System.out.println("5 is smaller than second nr");
        } else {
            System.out.println("5 is not smaller than second nr");
        }

        mrBlabla.getAddress().setClean(false);
        System.out.println("the house is clean: " + mrBlabla.getAddress().isClean());

        if(mrBlabla.getAddress().isClean() == true) {
            System.out.println("i dont need to clean a clean house");
        } else {
            mrBlabla.cleanHouse();
        }

        System.out.println("the house is clean: " + mrBlabla.getAddress().isClean());


    }


}
