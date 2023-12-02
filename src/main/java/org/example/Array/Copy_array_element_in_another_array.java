package org.example.Array;

import java.util.Arrays;

public class Copy_array_element_in_another_array {
    public static void main(String[] args) {
        int[] arr = {
                0,1,2,3,4,5,6,7,8,9
        };
        int[] arr2 = new int[arr.length];


        System.out.println(Arrays.toString(copy_array_element(arr,arr2)));
    }

    private static int[] copy_array_element(int[] arr, int[] arr2) {
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        return arr2;
    }
}
