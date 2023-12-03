package org.example.Matrix_Array;

public class program_4 {
    public static void main(String[] args) {
//     4. Sum of element of matrix
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int row = matrix.length;
        int col = matrix[0].length;
        int sum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sum += matrix[i][j];
            }
        }
        System.out.println(sum);
    }
}
