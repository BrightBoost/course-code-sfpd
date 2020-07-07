package com.company.day6;

public class ExplainingChar {
    public static void main(String[] args) {
        int x = 6;
        double y = 7.8;
        boolean b = true;
        //single quotes and only one character
        char c = 'e';
        //we can put an int in a double
        //adding precision, not losing anything
        y = x;
        //we can't put a double in an int without
        //saying Java that's okay
        //x = y;
        //if we cast it, we can
        //casting results in the decimal value being cut off
        //so 7.8 would become 7
        x = (int) y;
        //so can we put a char in an int?
        //yes it is using the int value of the char
        x = c;
        System.out.println(x);

        //can we put an int in a char?
        //only with a cast
        //int can be negative, char cant
        //int can be bigger than char
        //with a cast you say that you're sure it will fit
        c = (char) x;
        System.out.println(c);

        char c1 = '\u5c12';
        System.out.println(c1);
        int x2 = c1;
        System.out.println(x2);

        //joke with integers
        Integer i = Integer.MAX_VALUE;
        System.out.println(i);
        Integer i2 = Integer.MIN_VALUE;
        System.out.println(i2);
        //here comes the joke
        i = i + 1;
        System.out.println("max value + 1: " + i);

        //min value minus one
        System.out.println(i2-1);
    }
}
