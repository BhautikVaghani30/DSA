package org.example.Array;

public class program_26 {
    public static void main(String[] args) {
        int[] arr = {
                0,1,2,3,4,5,6,7,8,9
        };
        binarysearch(arr,9);
    }

    private static void binarysearch(int[] arr, int i) {
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if (arr[mid] == i){
                System.out.println("present");
                break;
            } else if (arr[mid] < i) {
                start = mid+1;
            }else{
                end = mid-1;
            }

        }
    }
}
