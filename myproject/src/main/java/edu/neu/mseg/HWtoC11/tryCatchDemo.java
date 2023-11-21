package edu.neu.mseg.HWtoC11;

public class tryCatchDemo {
    public static void main(String[] args) {
        try{
            int[] array = new int[3];
            array[4] = 7;
        }catch(Exception e){
            System.out.println("there is an exception");
        }
    }

    
}
