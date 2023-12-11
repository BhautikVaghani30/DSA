package org.example.HashTable;

import java.util.HashSet;

public class program_4 {
    public static void main(String[] args) {
        int[] array = {1, 4, 7, 2, 9, 10};
        int targetSum = 14;

        boolean pairExists = hasPairWithSum(array, targetSum);

        if (pairExists) {
            System.out.println("A pair with the sum " + targetSum + " exists in the array.");
        } else {
            System.out.println("No pair with the sum " + targetSum + " found in the array.");
        }
    }
    public static boolean hasPairWithSum(int[] array, int targetSum) {
        HashSet<Integer> seenNumbers = new HashSet<>();
        for (int num : array) {
            int complement = targetSum - num;


            if (seenNumbers.contains(complement)) {
                return true;
            }
            seenNumbers.add(num);
        }
        return false;
    }
}
