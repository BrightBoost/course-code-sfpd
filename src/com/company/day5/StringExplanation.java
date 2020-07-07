package com.company.day5;

public class StringExplanation {

    public static void main(String[] args) {
        String s = "All fresh now??";
        s = "good afternoon";


        boolean x =  s.contains("esh");
        System.out.println(x);

        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s);
    }

    public boolean  makingMyPointWithStrings(String s){
        // == != equals >> == pointer and equals is value
        if("hi".equals(s)){
            return true;
        } else {
            return false;
        }
    }
}
