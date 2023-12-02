package org.example.Array;

import java.util.Arrays;

public class program_27 {
    public static void moveZerosAndOnes(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // Move left pointer to the right until a 1 is found
            while (arr[left] == 1 && left < right) {
                left++;
            }

            // Move right pointer to the left until a 0 is found
            while (arr[right] == 0 && left < right) {
                right--;
            }

            // Swap 0 and 1
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 1, 0, 0, 1, 1, 0};

        System.out.println("Original array: " + Arrays.toString(arr));
     
        moveZerosAndOnes(arr);

        System.out.println("Array after moving 0s to the right and 1s to the left: " + Arrays.toString(arr));
    }
}
