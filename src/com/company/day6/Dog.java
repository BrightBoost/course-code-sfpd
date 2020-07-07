package com.company.day6;

public class Dog extends Animal {
    private String breed;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    //custom constructor 1
    public Dog(){
        this("default");
    }

    //custom constructor 2
    public Dog(String breed){
        //even though we don't see it
        //it will call super() here, but you don't see it
        //super();
        //if you want to call a constructor with args:
        //super("sjakie", 5);
        //super() is for constructors in the parent class
        //this() is for constructors in the own class
        //this.breed refers to the field of the class
        //second one is the input parameter
        //we are setting the value of the class field to
        //the input parameter
        this.breed = breed;
    }
}
