package com.company.day4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FunWithCollections {
    public static void main(String[] args) {
        //list
        List<String> stringList = new ArrayList<>();
        stringList.add("hi guys");
        stringList.add("hello everyone");
        stringList.add("good afternoon ladies and gentlemen");
        stringList.add("dear travellers");

        System.out.println(stringList.get(1));
        System.out.println(stringList.size());

        //remove element with index 1
        stringList.remove(1);
        System.out.println(stringList.get(1));
        System.out.println(stringList.size());

        //replace item
        System.out.println(stringList.get(2));
        stringList.set(2, "bye");
        System.out.println(stringList.get(2));

        //insert item
        stringList.add(2, "hi Alain, good question");

        //throw all items of stringList away
        stringList.clear();


        //foreach
    }
}
