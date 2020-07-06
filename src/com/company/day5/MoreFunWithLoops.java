package com.company.day5;

public class MoreFunWithLoops {
    public static void main(String[] args) {
        int j = 0;
        int k = 1000;
        // while
        while(j < 1000){
            j++;
            if(j % 7 != 0){
                continue;//go back to evaluating condition again
            }
            System.out.println(j);
            break; // i'm done break the entire loop
        }
        //write a while loop
        //find a number that can be divided by 7, 45 and 2
        //higher than a 1000
        //quit the loop using break


        // for
        for(int i = 0; i < 10; i++){
            System.out.println(i);
        }

        // for each or enhanced for loop
        String[] greetings = {"hi", "hello", "bonjour"};
        for(String s : greetings){
            System.out.println(s);
        }

        // do while - do at least once
        do {
            System.out.println("at least once");
        } while(false);
    }
}
