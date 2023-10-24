package edu.neu.mseg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class HelloApp 
{
    public static void main( String[] args )
    {
        // Part 1 - Array
        int[] x = {10, 25, 5, 18, 12};
        int[] y = {15, 8, 30, 14, 20};

        int[] z = new int[5];

        // Populate the z array with the maximum values from x and y
        for (int i = 0; i < 5; i++) {
            z[i] = Math.max(x[i], y[i]);
        }

        // Display the arrays in a nicely formatted output
        System.out.print("Array x = {");
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i]);
            if (i < x.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");

        System.out.print("Array y = {");
        for (int i = 0; i < y.length; i++) {
            System.out.print(y[i]);
            if (i < y.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");

        System.out.print("Array z = x + y = {");
        for (int i = 0; i < z.length; i++) {
            System.out.print(z[i]);
            if (i < z.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");

        // Part 2 - ArrayList
        List<String> names = new ArrayList<>(Arrays.asList("John", "Alice", "Bob", "Eve", "Charlie"));

        // Switch the first and last letters in each name
        List<String> switchedNames = new ArrayList<>();
        for (String name : names) {
            if (name.length() >= 2) {
                char firstLetter = name.charAt(0);
                char lastLetter = name.charAt(name.length() - 1);
                String switchedName = lastLetter + name.substring(1, name.length() - 1) + firstLetter;
                switchedNames.add(switchedName);
            } else {
                switchedNames.add(name); // Name too short to switch
            }
        }

        // Display the switched names in a nicely formatted output
        System.out.print("Names = {");
        for (String name : names) {
            System.out.print(name);
            if (names.indexOf(name) < names.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");

        System.out.print("Names (switched) = {");
        for (String switchedName : switchedNames) {
            System.out.print(switchedName);
            if (switchedNames.indexOf(switchedName) < switchedNames.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}
