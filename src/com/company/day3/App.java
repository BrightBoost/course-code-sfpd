package com.company.day3;

public class App {
    public static void main(String[] args) {
        //instance of address
        Address address = new Address();
        address.setStreetName("street something");
        address.setNr("2");
        address.setCity("brussels");

        //instance of person
        Person mrBlabla = new Person();
        mrBlabla.setAddress(address);
        mrBlabla.setAge(34);
        mrBlabla.setName("Mr Blabla");

        System.out.println(mrBlabla.getAddress().getCity());
        mrBlabla.cleanHouse();
    }


}
