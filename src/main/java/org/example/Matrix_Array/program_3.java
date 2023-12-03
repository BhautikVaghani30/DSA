package org.example.Matrix_Array;

public class program_3 {
    public static void main(String[] args) {
//        3. Find element from matrix
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int row = matrix.length;
        int col = matrix[0].length;
        int key = 5;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == key){
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
