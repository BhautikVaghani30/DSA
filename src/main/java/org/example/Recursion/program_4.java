package org.example.Recursion;

public class program_4 {
    public static void main(String[] args) {
//        4. Print the array elements using without loop
        int[] arr = {
                1,2,3,4,5,6,7,8,9,10
        };
        int i = arr.length-1;
        printarray(arr,i);
    }

    private static void printarray(int[] arr, int i) {
        if (i==-1){
            return;
        }
        printarray(arr,i-1);

        System.out.println(arr[i]);
        return;


    }
}
