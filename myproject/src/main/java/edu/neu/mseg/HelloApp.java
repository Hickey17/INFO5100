package edu.neu.mseg;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class HelloApp 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Prompt the user to enter a word
        System.out.print("Enter any word: ");
        
        long startTime = System.currentTimeMillis(); // Record the start time

        String input = scanner.nextLine().trim(); // Read the user's input and remove leading/trailing spaces

        long endTime = System.currentTimeMillis(); // Record the end time

        long reactionTime = (endTime - startTime) / 1000; // Calculate reaction time in seconds

        // Step 2: Check if the user entered an empty word
        if (input.isEmpty()) {
            System.out.println("You did not enter any word.");
            return; // Exit the program
        }

        // Step 3: Classify the word as short, medium, or long
        String wordClassification;
        if (input.length() <= 5) {
            wordClassification = "short";
        } else if (input.length() <= 10) {
            wordClassification = "medium";
        } else {
            wordClassification = "long";
        }

        // Step 4: Output the result
        System.out.println("Your word is " + input);
        System.out.println("It is a " + wordClassification + " word");
        System.out.println("The length of the word is " + input.length());
        System.out.println("Your reaction time is " + reactionTime + " seconds");

        scanner.close();
    }
}
