package org.example.Array;

public class Print_odd_elements_first_then_even_elements_from_array {
    public static void main(String[] args) {
        int[] arr = {
                0,1,2,3,4,5,6,7,8,9
        };
        print_odd_even(arr);
    }

    private static void print_odd_even(int[] arr) {
            System.out.print("odd : ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2!=0){
                System.out.print(arr[i]+",");
            }
        }
        System.out.println();
        System.out.print("Even: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0){
                System.out.print(arr[i]+",");
            }
        }
    }
}
