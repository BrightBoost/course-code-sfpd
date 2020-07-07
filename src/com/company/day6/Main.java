package com.company.day6;

public class Main {
    public static void main(String[] args) {
        //first go to constructor Dog()
        //that sends you to Dog(string breed)
        //that sends you to Animal()
        //then you go back to Dog(String breed)
        //back to Dog()
        //done, created a Dog
        Dog d = new Dog();
        //now create dog with breed variable
        Dog d1 = new Dog("chihuahua");

        Dog d2 = new Dog("Java", 5, "Labradoodle");

    }
}
