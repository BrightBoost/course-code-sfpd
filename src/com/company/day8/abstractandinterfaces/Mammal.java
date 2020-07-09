package com.company.day8.abstractandinterfaces;

public abstract class Mammal extends Animal {
    public Mammal(String s){
        super(s); //calling constructor one level higher
    }

    public String getName() {
        return "hi";
    }

    private String somethingMammal;

    public String getSomethingMammal() {
        return somethingMammal;
    }

    public void setSomethingMammal(String somethingMammal) {
        this.somethingMammal = somethingMammal;
    }

    public void showingSuper(){
        getName(); // this one is reffering to getname in mammal
        super.getName(); // this one is referring to getname in animal
    }
}
