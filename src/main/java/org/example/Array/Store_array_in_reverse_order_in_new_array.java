package org.example.Array;

import java.util.Arrays;

public class Store_array_in_reverse_order_in_new_array {
    public static void main(String[] args) {
        int[] arr = {
                0,1,2,3,4,5,6,7,8,9
        };
        int[] arr2 = new int[arr.length];
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            arr2[n-i-1] = arr[i];
        }
        System.out.println(Arrays.toString(arr2));
//        System.out.println(copy_in_reverse(arr,arr2));
    }

    private static int[] copy_in_reverse(int[] arr, int[] arr2) {
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            arr2[n-i-1] = arr[i];
        }
        return arr2;
    }
}
