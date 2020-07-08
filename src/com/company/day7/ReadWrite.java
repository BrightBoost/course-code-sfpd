package com.company.day7;

import java.io.*;

public class ReadWrite {
    public static void main(String[] args) {
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


// Read the content from file
        try {
            FileReader fileReader = new FileReader(absolutePath);
            int ch;
            //end of file character is -1
            //range of char is between 0 and 65535
            //read has to give back an int, because end of file doesnt fit in char
            //this is why we have to cast back the int to a char in our print line
            while((ch = fileReader.read()) != -1) {
                System.out.print((char)ch);
            }
            fileReader.close();

        } catch (FileNotFoundException e) {
            // Exception handling
            System.out.println("where's the file?!");
        } catch (IOException e) {
            System.out.println("something else IO like went wrong");
            // Exception handling
        }

        //exercise
        //what you have just written to your file
        //you are going to read
        //and write to another file
        //what is the result?
    }
}
