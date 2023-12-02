package org.example.Array;

public class Print_alternate_elements_from_array {
    public static void main(String[] args) {
        int[] arr = {
                0,1,2,3,4,5,6,7,8,9
        };
        int[] sarr = {
                9,8,7,6,5,4,3,2,1,0
        };
        Print_alternate(arr,sarr);
    }

    private static void Print_alternate(int[] arr,int[] sarr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " " + sarr[i] + " ");
        }
    }
}
