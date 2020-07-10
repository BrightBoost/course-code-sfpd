package com.company.day8.abstractandinterfaces;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog("Vicky");
        Mammal mammal = new Dog("Hector");
        mammal.getSomethingMammal();
        Dog d = new Dog("Java");
        d.setSomethingMammal("blabla");
        animal.eat();

        //interface day
        Mouse m = new Mouse("Micky");
        m.runAndHide();

        Prey m2 = new Mouse("Mini");

        Mammal m3 = new Mouse("Mini2");

        Animal m4 = new Mouse("Micky2");

        if(m4 instanceof Prey){
            ((Prey) m4).runAndHide();
        }

        // ((Predator) m4).eatPrey(m);

        //exercise
        //A: recreate what we just did with prey and predator
        //B: create a vehicle hierarchy (coded) with an EV interface

    }
}
