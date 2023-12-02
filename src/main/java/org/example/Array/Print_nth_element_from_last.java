package org.example.Array;

public class Print_nth_element_from_last {

    public static void main(String[] args) {
        int[] arr = {
                0,1,2,3,4,5,6,7,8,9
        };
        print_nth_last(arr,5);
    }

    private static void print_nth_last(int[] arr, int i) {
        for (int j = i; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}
