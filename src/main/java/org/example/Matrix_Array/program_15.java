package org.example.Matrix_Array;

public class program_15 {
    public static void main(String[] args) {
//        15. Sum of all diagonal elements in matrix (same position not
//                allowed twice)
        int[][] matrix = {
                {9,10,3},
                {7,5,69 },
                {7,1,8}
        };
        int row = matrix.length;
        int col = matrix[0].length;
        int sum=0;
        int sumsec = 0;
        for (int i = 0; i < row; i++) {
           sum+=matrix[i][i];
           if (i != matrix.length-i-1){
               sumsec+=matrix[i][col-i-1];
           }
        }
        System.out.println("primary sum of digonal : " + sum);
        System.out.println("secoundry sum of digonal : " + sumsec);
    }
}
