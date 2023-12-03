package org.example.Matrix_Array;

public class program_14 {
    public static void main(String[] args) {
//        14. Print diagonal elements (top-right to bottom-left)
        int[][] matrix = {
                {9,10,3},
                {7,5,69 },
                {7,1,8}
        };
        int row = matrix.length;
        int col = matrix[0].length;
        System.out.print("top-right to bottom-left : ");
        for (int i = 0; i < row; i++) {
            System.out.print(matrix[i][row-i-1] + " ");
        }

    }
}
