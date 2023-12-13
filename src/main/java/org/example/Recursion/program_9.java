package org.example.Recursion;

public class program_9 {
    private static int max = 0;
    public static void main(String[] args) {
//        9. get the largest element of an array using recursion
        int[] arr = {
                9,2,3,4,5,1000000000,6,7,8,1
        };
        int i = arr.length-1;
        System.out.println(findLargest(arr,i));
    }

    private static int findLargest(int[] arr, int i) {
        if (i == -1){
            return max;
        }
        if (arr[i] > max) max = arr[i];
        max = findLargest(arr,i-1);
        return max;
    }
}
