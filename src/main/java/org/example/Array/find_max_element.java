package org.example.Array;

public class find_max_element {

    public static void main(String[] args) {
        int[] arr = {
                0,1,2,3,4,5,6,7,8,9
        };
        System.out.println(find_max(arr));
    }

    private static int find_max(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
