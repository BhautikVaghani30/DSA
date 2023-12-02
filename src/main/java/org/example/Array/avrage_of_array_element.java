package org.example.Array;

public class avrage_of_array_element {
    public static void main(String[] args) {
        int[] arr = {
                2, 3, 3, 5, 7, 10
        };
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int avrage = sum/ arr.length;
        System.out.println("Avrage of all array element is : "+avrage);
    }
}
