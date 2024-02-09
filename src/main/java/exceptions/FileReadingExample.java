package exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingExample {

    public static void main(String[] args) {
        // Path to the file to be read
        String filePath = "/Users/shruthithirunagari/Downloads/Example.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            // Read each line from the file and print it to the console
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            // Handle any exceptions that occur during file reading
            e.printStackTrace();
        }
    }
}

