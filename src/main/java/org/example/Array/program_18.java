package org.example.Array;

public class program_18 {
    public static void main(String[] args) {
        int[] arr = {
                0,1,2,3,4,5,7,6,7,8,9
        };
        System.out.println(duplicate(arr,7));
    }

    private static String duplicate(int[] arr,int v) {
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == v)c++;
        }
        if (c > 1) return "duplicate";
        return "not duplicate";
    }
}
