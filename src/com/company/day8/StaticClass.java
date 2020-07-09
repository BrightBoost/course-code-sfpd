package com.company.day8;


import java.util.List;

public class StaticClass {
    private int someInt;
    private List<String> someList;

    public static int someStaticInt;
    //constant
    public static final int constInt = 8;

    public int getSomeStaticInt(){
        return someStaticInt;
    }

    public void setSomeStaticInt(int x){
        someStaticInt = x;
    }

    public List<String> getSomeList() {
        return someList;
    }

    public void setSomeList(List<String> someList) {
        this.someList = someList;
    }

    public int getSomeInt() {
        return someInt;
    }

    public void setSomeInt(int someInt) {
        this.someInt = someInt;
    }

    //non static method
    public void saySomething(String str){
        this.someInt = 7;
        System.out.println("str: " + str);
    }

    public static void saySomethingStatic(String str){
        StaticClass staticClass = new StaticClass();
        staticClass.saySomething("hi");
        //you cannot call non-static methods or access non static fields
        //because static methods are not called on an instance
        //so these methods and fields are unavailable, as they belong to the instance
        //you can access them when you create an instance in a static method

        //saySomething("hi");//won't work
        //this.someInt = 7; //won't work, no instance
        System.out.println("static str: " + str);
    }

}
