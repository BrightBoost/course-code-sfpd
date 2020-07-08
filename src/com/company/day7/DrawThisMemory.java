package com.company.day7;

import com.company.day3.Person;

import java.util.ArrayList;
import java.util.List;

public class DrawThisMemory {
    public static void main(String[] args) {
        int x = 6;
        double y = 6.7;
        boolean b = false;
        Person p = new Person();
        p.setName("Maaike");
        p.setAge(29);
        List<Person> personList = new ArrayList<>();
        personList.add(p);
        //i just added an object, so the size is one
        System.out.println(personList.size());;
        //and now im going to send the personlist to another method,
        //but i'm sending the reference in memory
        //so changes made there, will be visible here
        //because we are looking at the same object
        doSomething(personList);
        //has been cleared, so 0
        System.out.println(personList.size());;


        //this is different for int, because then you are sending copies around
        int s = 8;
        System.out.println(s);
        doSomethingInt(s);
        System.out.println(s);

    }

    public static void doSomething(List<Person> list) {
        list.clear();
    }

    public static void doSomethingInt(int x){
        x = 0;
    }
}
