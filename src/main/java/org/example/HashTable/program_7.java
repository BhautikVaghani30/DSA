package org.example.HashTable;

import java.util.HashSet;
import java.util.Set;

public class program_7 {
    public static void main(String[] args) {
//      Print all the duplicate numbers in array
        Set<Integer> set = new HashSet<>();
        int[] arr = {
                1,2,3,2,4,2,5,6,5,6,4,1,6
        };
        for (int i = 0; i < arr.length; i++) {
            if (!set.add(arr[i])){
                System.out.println(arr[i]);
            }
        }
    }
}
