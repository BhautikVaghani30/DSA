package org.example.Matrix_Array;

public class program_9 {
    public static void main(String[] args) {
//      9.  Find highest sum among all rows
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int row = matrix.length;
        int col = matrix[0].length;
        int sum=0;
        int max = 0;
        for (int i = 0; i < row; i++) {
            sum=0;
            for (int j = 0; j < col; j++) {
                sum+=matrix[i][j];
            }
            if (max < sum){
                max = sum;
            }
        }
        System.out.println(max);
    }
}
