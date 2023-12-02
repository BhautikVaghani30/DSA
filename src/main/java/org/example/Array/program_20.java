package org.example.Array;

public class program_20 {
    public static void main(String[] args) {
        int[] arr = {
                0,1,2,0,3,4,5,6,7,8,9
        };
       unique(arr);
    }
    private static void unique(int[] arr) {
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1) continue;
            c=0;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]){
                    c++;
                    arr[j] = -1;
                }
            }
            if (c == 0) System.out.print(arr[i] + " ");
        }

    }
}
