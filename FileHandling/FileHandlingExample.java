// Program: File Handling Example in Java
// Description: Demonstrates how to create, write, read, and get information about a file.

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

class FileHandlingExample {
    public static void main(String[] args) {
        try {
            // Step 1: Create a File object
            File file = new File("example.txt");

            // Step 2: Create a new file (if it doesn't exist)
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }

            // Step 3: Write content to the file
            FileWriter writer = new FileWriter(file);
            writer.write("Welcome to Java File Handling!\n");
            writer.write("This file is created and written using FileWriter class.");
            writer.close();
            System.out.println("Data successfully written to the file.");

            // Step 4: Read content from the file
            System.out.println("\n--- Reading File Content ---");
            FileReader reader = new FileReader(file);
            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
            reader.close();

            // Step 5: Display file information
            System.out.println("--- File Information ---");
            System.out.println("File Name: " + file.getName());
            System.out.println("Absolute Path: " + file.getAbsolutePath());
            System.out.println("Readable: " + file.canRead());
            System.out.println("Writable: " + file.canWrite());
            System.out.println("File Size: " + file.length() + " bytes");

        } catch (IOException e) {
            System.out.println("An error occurred while handling the file.");
            e.printStackTrace();
        }
    }
}
/*
   ====== Compilation and Execution ======

   > javac FileHandlingExample.java
   > java FileHandlingExample

   ====== Output ======

   File created: example.txt
   Data successfully written to the file.

   --- Reading File Content ---
   Welcome to Java File Handling!
   This file is created and written using FileWriter class.

   --- File Information ---
   File Name: example.txt
   Absolute Path: D:\Core Java\FileHandling\example.txt
   Readable: true
   Writable: true
   File Size: 87 bytes
*/

