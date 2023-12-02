package org.example.Array;

import java.util.Arrays;

public class program_16 {
    public static void main(String[] args) {
        int[] arr = {
                0,1,2,3,4,5,6,7,8,9
        };
        int[] arr2 = {
                9,8,7,6,5,4,3,2,1,0
        };
        alternativ_array(arr,arr2);
    }

    private static void alternativ_array(int[] arr,int[] arr2) {
        int[] arr3 = new int[arr.length+arr2.length];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            arr3[j] = arr[i];
            j++;
            arr3[j]  = arr2[i];
            j++;

        }
        System.out.println(Arrays.toString(arr3));
    }
}
