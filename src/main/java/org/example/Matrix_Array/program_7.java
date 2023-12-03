package org.example.Matrix_Array;

public class program_7 {
    public static void main(String[] args) {
//        7. Print mirror image of matrix
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int row = matrix.length;
        int col = matrix[0].length;
        for (int j = 0; j < row; j++) {
            for (int i = col-1; i >= 0 ; i--) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
    }
}
