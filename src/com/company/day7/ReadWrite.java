package com.company.day7;

import java.io.*;

public class ReadWrite {
    public static void main(String[] args) {
        String directory = System.getProperty("user.home");
        String fileName = "example.txt";
        String absolutePath = directory + File.separator + fileName;

// Write the content in file
        try {
            FileWriter fileWriter = new FileWriter(absolutePath);
            String fileContent = "This could be anything, really.";
            fileWriter.write(fileContent);
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
    }
}
