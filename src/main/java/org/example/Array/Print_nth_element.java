package org.example.Array;

public class Print_nth_element {
    public static void main(String[] args) {
        int[] arr = {
                0,1,2,3,4,5,6,7,8,9
        };
        print_nTh(arr,5);
    }

    private static void print_nTh(int[] arr,int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + ",");
        }
    }
}
