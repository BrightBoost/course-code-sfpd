package com.company.day5;

public class SwitchBasics {
    public static void main(String[] args) {
        char grade = 'C';
        switch (grade){
            case 'F':
                System.out.println("that's terrible");
            case 'D':
                System.out.println("auch");
                break;
            case 'C':
                System.out.println("hmmm");
            case 'B':
                System.out.println("okayish");
                break;
            case 'A':
                System.out.println("wonderfull");
                break;
            default:
                System.out.println("broke the scale");
        }

        String s = "tea";
        switch (s){
            //case tea

            //case coffee

            //case water

            //default
        }

    }
}
