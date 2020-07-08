package com.company.day7;

import java.io.*;

public class ReadWrite {
    public static void main(String[] args) {
        String directory = System.getProperty("user.home");
        String fileName = "example.txt";
        String absolutePath = directory + File.separator + fileName;

// Write the content in file
        try(FileWriter fileWriter = new FileWriter(absolutePath)) {
            String fileContent = "This is a sample text.";
            fileWriter.write(fileContent);
            fileWriter.close();
        } catch (IOException e) {
            // Exception handling
        }

// Read the content from file
        try(FileReader fileReader = new FileReader(absolutePath)) {
            int ch;
            while((ch = fileReader.read()) != -1) {
                System.out.print((char)ch);
            }

        } catch (FileNotFoundException e) {
            // Exception handling
        } catch (IOException e) {
            // Exception handling
        }
    }
}
