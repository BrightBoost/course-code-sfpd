package com.company.day5;

public class playwithSwitch {
    public static void main(String[] args) {
        char grade = 'F';
        int x = 2;
        switch (grade) {
            case 'F':
                System.out.println("i was expecting F");
            case 'D':
                System.out.println("i was expecting D");
            case 'C':
                System.out.println("i was expecting C");
                break;

            case 'B':
                System.out.println("i was expecting B");

            default:
                System.out.println("what ?");


        }
    }


}
    // bij elke case break zetten

//  without "break", gaat bij goede conditie F, ook D, C, B door
// input F => output F,D,C

// int , can also be a String


