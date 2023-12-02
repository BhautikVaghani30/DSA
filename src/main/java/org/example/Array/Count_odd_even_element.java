package org.example.Array;

public class Count_odd_even_element {
    public static String count(int[] arr){
        int e=0,o=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0)e++;
            else o++;
        }
        return "Number of event element is " + e + "\n" + "Number of odd element is " + o;
    }

    public static void main(String[] args) {
        int[] arr = {
                0,1,2,3,4,5,6,7,8,9
        };
        System.out.println(count(arr));
    }
}
