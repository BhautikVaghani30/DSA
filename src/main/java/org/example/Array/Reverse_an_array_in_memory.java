package org.example.Array;

import java.util.Arrays;

public class Reverse_an_array_in_memory {
    public static void main(String[] args) {
        int[] arr = {
                0,1,2,3,4,5,6,7,8,9
        };
        reverse_in_memory(arr);
    }

    private static void reverse_in_memory(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while (start < end){
            int t = arr[start];
            arr[start] = arr[end];
            arr[end] = t;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
