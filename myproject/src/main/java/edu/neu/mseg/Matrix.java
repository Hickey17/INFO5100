package edu.neu.mseg;

public class Matrix {
    
    public static void main(String[] args) {
        int[][] A = {{2, 3, 4}, {3, 4, 5}};
        int[][] B = {{1, 2}, {3, 4}, {5, 6}};
        // check whether A can multiple B
        System.out.println(canMultipe(A, B));
        // get the result of A multiple B
        printMatrix(multiple(A, B));
    }

    public static boolean canMultipe(int[][] matrixA, int[][] matrixB){
    // two matrix can multiple if the columns of matrixA equals to the rows of matrixB'
        try{
            int columnsA = matrixA[0].length;
            int rowsB = matrixB.length;
            return columnsA==rowsB;
        }catch(Exception e){
            return false;
        }
    }

    public static int[][] multiple(int[][] matrixA, int[][] matrixB){
        int matrixRows = matrixA.length;
        int matrixColumns = matrixB[0].length;
        int[][] matrix = new int[matrixRows][matrixColumns];
        for(int r=0;r<matrixRows;r++){
            for(int c=0;c<matrixColumns;c++){
                int res = 0;
                for(int i=0;i<matrixA[0].length;i++){
                    res += matrixA[r][i] * matrixB[i][c];
                }
                matrix[r][c] = res;
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix){
        int rows = matrix.length;
        int columns = matrix[0].length;
        for(int r=0;r<rows;r++){
            for(int c=0;c<columns;c++){
                System.out.print(matrix[r][c]+" ");
            }
            System.out.println();
        }
    }

}


