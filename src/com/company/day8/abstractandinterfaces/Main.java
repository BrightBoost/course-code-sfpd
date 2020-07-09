package com.company.day8.abstractandinterfaces;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog("Vicky");
        Mammal mammal = new Dog("Hector");
        mammal.getSomethingMammal();
        Dog d = new Dog("Java");
        d.setSomethingMammal("blabla");
        animal.eat();

    }
}
