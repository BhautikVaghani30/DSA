package org.example.Array;

public class program_25 {
    public static void main(String[] args) {
        int[] arr = {
                2,4,7,3,78,0,2,6,3,8,4
        };
        findmac(arr);

    }
    private static void findmac(int[] arr){
        int max = 0;
        int smax = 0;
        int tmax = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                tmax = smax;
                smax = max;
                max = arr[i];
            }
            else if (arr[i] > smax){
                tmax = smax;
                smax = arr[i];
            } else if (arr[i] > tmax) {
                tmax = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(smax);
        System.out.println(tmax);
    }
}
