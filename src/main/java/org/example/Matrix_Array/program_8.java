package org.example.Matrix_Array;

public class program_8 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3,4},
                {10,11,12,5},
                {9,8,7,6}
        };
        int startrow = 0;
        int startcol = 0;
        int endrow = matrix.length-1;
        int endcol = matrix[0].length-1;
        while (startrow <= endrow && startcol <= endcol){
            for (int j = startcol; j <= endcol; j++) {
                System.out.print(matrix[startrow][j] + " ");
            }
            for (int i = startrow+1; i <=endrow; i++) {
                System.out.print(matrix[i][endcol] + " ");
            }
            for (int j = endcol-1; j >= startcol; j--) {
                if(startrow == endrow) break;
                System.out.print(matrix[endrow][j] + " ");
            }
            for (int i = endrow-1; i >= startrow+1; i--) {

                if(startcol == endcol) break;
                System.out.print(matrix[i][startcol] + " ");
            }
            startrow++;
            startcol++;
            endrow--;
            endcol--;
        }

    }
}
