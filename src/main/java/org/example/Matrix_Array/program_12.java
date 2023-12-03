package org.example.Matrix_Array;

public class program_12 {
    public static void main(String[] args) {
//        12. Delete max element from each column
        int[][] matrix = {
                {9,10,3},
                {7,5,69 },
                {7,1,8}
        };
        int row = matrix.length;
        int col = matrix[0].length;
        int max=0;
        int index = 0;
        for (int i = 0; i < col; i++) {
            max=0;
            for (int j = 0; j < row; j++) {
                if (max<matrix[j][i]){
                    max = matrix[j][i];
                    index = j;
                }
            }
            for(int j = index; j<row-1; j++){
                int t = matrix[j][i];
                matrix[j][i] = matrix[j+1][i];
                matrix[j+1][i] = t;
            }
        }
        row--;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
