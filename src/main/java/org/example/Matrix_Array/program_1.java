package org.example.Matrix_Array;

public class program_1 {
    public static void main(String[] args) {
//        1. Find row and column size from given matrix
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int row = matrix.length;;
        int column = matrix[0].length;
        System.out.println("size of row of metrix is : " + row + "\n size of column of matrix is : " + column);
    }
}
