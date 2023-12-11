package org.example.Matrix_Array;

public class leetcode_1 {
    public static void main(String[] args) {
        int[][] mat = {
                {0,1},
                {1,0},
        };
        int[][] target = {

                {1, 0},
                {0, 1}
        };
        int row = mat.length;
        int col = mat[0].length;
        if (checkEqual(mat,target)){
            System.out.println("true");
            return;
        }
        for (int i = 0; i < 3; i++) {
            roated(mat);
            if (checkEqual(mat,target)){
                System.out.println("true");
                return;
            }
        }
        System.out.println("false");
        return;

    }

    private static void roated(int[][] mat) {
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            reverse(mat[i]);
        }
    }

    public static void reverse(int [] mat){
        int n = mat.length;
        int end = n-1;
        int start = 0;
        for (int i = 0; i < n/2; i++) {
            int temp = mat[start];
            mat[start] = mat[end];
            mat[end] = temp;
            start++;
            end--;
        }
    }
    public static boolean checkEqual(int[][] mat ,int[][] target){
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j] != target[i][j]){
                    return false;
                }
            }
        };
        return true;
    }
}
