package org.example.HashTable;

import java.util.*;

public class program_5 {
    public static void main(String[] args) {
//        5. Most frequent element in an array
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 2, 2, 3, 3, 3, 4, 4, 4, 4};

        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (frequencyMap.containsKey(arr[i])) {
                frequencyMap.put(arr[i], frequencyMap.get(arr[i]) + 1);
            } else {
                frequencyMap.put(arr[i], 1);
            }
        }


        int mostFrequentElement = -1;
        int maxFrequency = 0;

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                mostFrequentElement = entry.getKey();
                maxFrequency = entry.getValue();
            }
        }
        System.out.println(mostFrequentElement + ":" + maxFrequency);
    }
}
