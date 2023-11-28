package edu.neu.mseg.HWtoC12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class readFileDemo {
    public static void main(String[] args) {
        System.out.println("Current Working Directory: " + System.getProperty("user.dir"));

        String filePath = "myproject/src/main/java/edu/neu/mseg/HWtoC12/my_test_file.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath,true))) {
            // Write content to the file
            writer.newLine(); // Add a new line
            writer.write("Java write test");

            System.out.println("Data has been written to the file.");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
