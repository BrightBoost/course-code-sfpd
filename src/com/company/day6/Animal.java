package com.company.day6;

public class Animal {

    //if you don't specify a constructor, Java will add one for you
    //it looks like this
    public Animal(){

    }

    //as soon as i specify my own constructor,
    //Java no longer creates a default one for me
    //so if I specify this one, I need to adjust my child classes,
    //so that they point to an existing constructor
    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    private String name;
    private int age;

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
}
