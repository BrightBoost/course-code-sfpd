package com.company.day3;

public class FunWithLoops {
    public static void main(String[] args) {
        //while - a certain condition is true
        int x = 0;
        while(x < 56){
            System.out.println("hi there " + x);
            x = x + 1;
        }
        //one variable, start with x = 1
        //each iteration the variables are added: x = x + x
        //each iteration you will print x
        //do this until x > 1000000
        //count the number of times that takes and print it after the loop
        int count = 0;
        int y = 1;
        while(y < 1000000){
            System.out.println(y);
            count++; //count = count + 1;
            y = y + y;
        }

        System.out.println("the current value of y is: " + y + ". It took nr of times: " + count);

        //for - a certain amount of times
        //three parts: defines the counter, defines the condition, defines action
        //after each iteration
        for(int i = 0; i < 10; i++){
            System.out.println(i);
        }
        System.out.println("im done");
    }
}
