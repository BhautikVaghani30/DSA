package org.example.Array;

public class sum_array_element {
    public static void main(String[] args) {
        int[] arr = {
                0,1,2,3,4,5,6,7,8,9
        };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("the sum of array element is : " + sum);
    }
}
