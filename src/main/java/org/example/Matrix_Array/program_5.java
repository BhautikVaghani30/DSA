package org.example.Matrix_Array;

public class program_5 {
    public static void main(String[] args) {
//        5. Print matrix in reverse order
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int row = matrix.length;
        int col = matrix[0].length;
        for (int i = row-1; i >=0; i--) {
            for (int j = col-1; j >= 0; j--) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
