package org.example.Array;

import java.util.Arrays;

public class program_15 {
        public static void main(String[] args) {
            int[] arr = {
                    0,1,2,3,4,5,6,7,8,9
            };
            copy(arr);
        }

        private static void copy(int[] arr) {
            int[] ar = new int[arr.length*2];
            int n = arr.length;
            for (int i = 0; i < arr.length; i++) {
                ar[i] = ar[n+i] = arr[i];
            }
            System.out.println(Arrays.toString(ar));
        }
    }
