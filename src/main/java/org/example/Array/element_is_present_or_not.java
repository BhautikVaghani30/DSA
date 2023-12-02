package org.example.Array;

public class element_is_present_or_not {

    public static String search(int[] arr, int value){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value){
                return "present";
            }
        }
        return "not present";
    }
    public static void main(String[] args) {
        int[] arr = {
                0,1,2,3,4,5,6,7,8,9
        };
        System.out.println(search(arr,5));
    }
}
