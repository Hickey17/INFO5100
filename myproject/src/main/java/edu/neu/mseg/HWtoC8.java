package edu.neu.mseg;

public class HWtoC8 {
    public static void main(String[] args) {
        
        String[] array1 = {"Anne", "John", "Alex", "Jessica"};
        String[] array2 = {"Sun", "Mercury", "Venus", "Earth", "Mars", "Jupiter"};
        System.out.println("Original array: ");
        printArray(array1);
        System.out.println("Resultant array: ");
        printArray(reverseStrings(array1));

        System.out.println("Original array: ");
        printArray(array2);
        System.out.println("Resultant array: ");
        printArray(reverseStrings(array2));
        
    }

    private static String[] reverseStrings(String[] strings){
        int stringsNum = strings.length;
        String[] result = new String[stringsNum];
        for(int i=0;i<stringsNum;i++){
            String originalString = strings[stringsNum-1-i];
            originalString = originalString.toLowerCase();
            result[i] = reverseString(originalString);
            
        }

        return result;
    }
    private static String reverseString(String string){
        int stringSize = string.length();
        String result = "";
        for(int i=stringSize-1;i>=0;i--){
            result = result+string.charAt(i);
        }
        result.toLowerCase();
        result = result.substring(0,1).toUpperCase()+result.substring(1,stringSize);
        return result;
    }

    public static void printArray(String[] array) {
        for (String element : array) {
            System.out.println("  \"" + element + "\",");
        }
    }
        
}
