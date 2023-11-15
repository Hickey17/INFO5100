package edu.neu.mseg;

public class MidTerm {
    public static void main(String[] args) {
        // initiate a 3*4 matrix
        int[][] matrixA = new int[][]{{1,3,5,7},{2,4,6,8},{7,7,1,2}};
        // print the result
        int result;
        System.out.println("the result is: "+sumOfMatrix(matrixA));

    }

    public static int sumOfMatrix(int[][] matrix){
        // firstly, we deal with the special case
        if(matrix==null)
            return 0;
        // get the rows and columns of the matrix
        int rows = matrix.length;
        int columns = matrix[0].length;
        // use nested for loop to calculate the result
        int result = 0;
        for (int r=0;r<rows;r++){
            for (int c=0;c<columns;c++){
                result += matrix[r][c];
            }
        }
        return result;
    }
}
