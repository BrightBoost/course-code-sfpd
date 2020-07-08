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
        }
        catch (ArithmeticException e){
            System.out.println("we skipped this because you cannot dividee by 0");
        }
        catch (RuntimeException e){
            System.out.println("oh no");
        }
        catch(Exception e){
            System.out.println("o no");
        }

        //create an array
        //access an element that's not in there
        //catch the arrayindexoutofboundsexception
        //print a message
        int[] arr = {1,2,3};
        try{
            arr[4] = 5;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("oh no index out of bounds");
        }

       // throw new NullPointerException("oeps");
    }
}
