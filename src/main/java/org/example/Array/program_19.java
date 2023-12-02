package org.example.Array;

public class program_19 {
    public static void main(String[] args) {
        int[] arr = {
                0,1,2,3,4,5,6,7,8,9
        };
        System.out.println(unique(arr,7));
    }
    private static String unique(int[] arr,int v) {
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == v)c++;
        }
        if (c == 1) return "unique";
        return "not unique";
    }
}
