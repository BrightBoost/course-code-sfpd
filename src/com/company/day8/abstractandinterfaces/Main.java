package com.company.day8.abstractandinterfaces;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog("Vicky");
        Mammal mammal = new Dog("Hector");
        mammal.getSomethingMammal();
        Dog d = new Dog("Java");
        d.setSomethingMammal("blabla");
        //animal.eat();

        //interface day
        Mouse m = new Mouse("Micky");
        m.runAndHide();

        Prey m2 = new Mouse("Mini");

        Mammal m3 = new Mouse("Mini2");

        Animal m4 = new Mouse("Micky2");

        //you can  use instanceof to see whether a certain cass is a specific instance of another one
        //this makes it safe to cast after that
        if(m4 instanceof Prey){
            ((Prey) m4).runAndHide();
        }

        Snake s = new Snake("sissy");
        //default method and static method in interface
        s.eat();
        //static methods in interfaces must be called without an instance, but on the interface directly
        Predator.eatPreyStatically(m);


        List<Prey> list = new ArrayList<>();
        //if you cast a class to something that it cannot be casted to, you'll get a classcastexception
        // ((Predator) m4).eatPrey(m);

        //exercise
        //A: recreate what we just did with prey and predator
        //B: create a vehicle hierarchy (coded) with an EV interface

    }
}
