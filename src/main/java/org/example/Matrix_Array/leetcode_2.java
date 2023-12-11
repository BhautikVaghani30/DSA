package org.example.Matrix_Array;

public class leetcode_2 {
    public static void main(String[] args) {
        int[][] grid = {
                {2,0,0,1},
                {0,3,1,0},
                {0,5,2,0},
                {4,0,0,2}
        };
        daigonal(grid);
    }

    private static void daigonal(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        for (int i = 0; i < grid.length; i++) {

                if (grid[i][i] <= 0){
                    System.out.println("false");
                    return;
                } else if (grid[i][col-i-1] <= 0) {
                    System.out.println("false");
                    return;
                }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(i!=j){
                    if (grid[i][j] > 0 && j != col-i-1){
                        System.out.println("false");
                        return;
                }

                }
            }
        }
        System.out.println("true");
        return;
    }
}
