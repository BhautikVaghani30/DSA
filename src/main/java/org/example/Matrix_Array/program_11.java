package org.example.Matrix_Array;

public class program_11 {
    public static void main(String[] args) {
        int[][] matrix = {
                {9,8,3},
                {7,5,6},
                {7,10,8}
        };
        int row = matrix.length;
        int col = matrix[0].length;
        int max=0;
        int index = 0;
        for (int i = 0; i < row; i++) {
            int j = 0;
            for (; j < col; j++) {
                if(max < matrix[i][j]){
                    max = matrix[i][j];
                    index = j;
                }
            }
            for (int k = index; k < col-1; k++) {
                int t = matrix[i][k];
                matrix[i][k] = matrix[i][k+1];
                matrix[i][k+1] = t;
            }

        }
        col--;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

}
