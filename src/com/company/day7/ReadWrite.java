package com.company.day7;

import com.company.day6.Animal;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import javax.sql.rowset.Predicate;
import java.io.*;

public class ReadWrite {
    public static void main(String[] args) throws Exception {
        String directory = System.getProperty("user.home");
        String fileName = "example.txt";
        String absolutePath = directory + File.separator + fileName;

// Write the content in file
        try {
            //using append = true, you can append to a file, so not overwriting it
            FileWriter fileWriter = new FileWriter(absolutePath, true);
            String fileContent = "This could be anything, really.";
            //if you want to append, use the .append, else you can use .write
            //if append is not set to true, .append will just write
            fileWriter.append(fileContent);
            fileWriter.close();
        } catch (IOException e) {
            // Exception handling
            System.out.println("another problem with IO");
        }
            //exercise
            //create a list of strings
            //write all these strings to a file

        FileReader fileReader = null;
// Read the content from file
        try {
            fileReader = new FileReader(absolutePath);
            int ch;
            //end of file character is -1
            //range of char is between 0 and 65535
            //read has to give back an int, because end of file doesnt fit in char
            //this is why we have to cast back the int to a char in our print line
            while((ch = fileReader.read()) != -1) {
                System.out.print((char)ch);
            }

        } catch (FileNotFoundException e) {
            // Exception handling
            System.out.println("where's the file?!");
        } catch (IOException e) {
            System.out.println("something else IO like went wrong");
            // Exception handling
        } finally {
            //we have to close our filereader in the finally block
            //the finally block is always executed
            //so better to close it here, than in a try block that might not finish,
            //but throw an exception halfway
            //leaving the filereader open forever and ever etc

            if(fileReader != null){
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        //try with resources
        //you open the resource(in this case filereader) in ( and ) after try
        //java closes the resources opened here for you
        //so you don't need the ugly finally block as you had in the example above
        try(FileReader fileReader1 = new FileReader(absolutePath); FileWriter fileWriter = new FileWriter("blabla.txt")){
            //some code to read a file
        }catch (IOException e){
            System.out.println("blabla");
        }

        //exercise
        //what you have just written to your file
        //you are going to read
        //and write to another file
        //what is the result? and why?
    }
}
