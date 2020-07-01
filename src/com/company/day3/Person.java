package com.company.day3;

public class Person {
    private String name;
    private int age;
    private Address address;

    public void printPersonAddress(){
        System.out.println(address.getCity());
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void cleanHouse(){
        Vacuumcleaner vacuumcleaner = new Vacuumcleaner();
        vacuumcleaner.vacuum(address);
        address.setClean(true);
    }
}
