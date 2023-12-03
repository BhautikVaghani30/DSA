package org.example.Matrix_Array;

public class program_13 {
    public static void main(String[] args) {
//      13.  Print diagonal elements (top-left to bottom-right)
        int[][] matrix = {
                {9,10,3},
                {7,5,69 },
                {7,1,8}
        };
        int row = matrix.length;
        int col = matrix[0].length;
        System.out.print("top-left to bottom-right : ");
        for (int i = 0; i < row; i++) {
            System.out.print(matrix[i][i] + " ");

        }

    }
}
