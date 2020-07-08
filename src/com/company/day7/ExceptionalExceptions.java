package com.company.day7;


import java.io.FileReader;
import java.nio.file.FileSystemAlreadyExistsException;
import java.text.NumberFormat;

public class ExceptionalExceptions {
    public static void main(String[] args) {
        //you need to handle checked exceptions
        //checked exceptions are the ones that extend exceptions
        //unchecked exceptions extend runtimeexception
        //you can handle unchecked exceptions to
        //put the code that might throw an exception in a try
        //catch the specific exception
        //define the protocol

        try {
            int x = 0;
            int result = 8 /x;
        } catch (ArithmeticException e){
            System.out.println("we skipped this because you cannot dividee by 0");
        }

        //create an array
        //access an element that's not in there
        //catch the arrayindexoutofboundsexception
        //print a message

       // throw new NullPointerException("oeps");
    }
}
