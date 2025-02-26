package gptRecommendation.Day06;

/*Topic: Reading and Writing Files in Java

Task:

Write a Java program that reads from and writes to a text file using FileReader and FileWriter.

        Requirements:
        1.	Create a file named “data.txt” and write some sample text into it.
	    2.	Read the contents of the file and display them on the console.
        3.	Handle exceptions using try-catch-finally.*/


/*File written successfully!
Reading from file:
Hello, this is a Java file handling example!*/


import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingExample {
    public static void main(String[] args) {
        String fileName = "data.txt";
        String content ="Hello, this is a Java file handling example!";

        try (FileWriter writer = new FileWriter(fileName)){
            writer.write(content);
            System.out.println("File written successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred while writing the file: "+e.getMessage());
        }
    }
}
