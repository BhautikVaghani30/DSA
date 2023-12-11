package org.example.HashTable;

import java.util.HashSet;
import java.util.Set;

public class program_2 {
    public static void main(String[] args) {
//        2. Find whether an array is subset of another array

        int[] arr = {
                1,2,3,4,5,6,7,8,9,10
        };
        int[] arr2 = {
                2,3,4
        };
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        int c = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (set.add(arr2[i])){
                c=0;
            }
        }
        if (c==0){
            System.out.println("Arr2 is Subset of arr");
        }else{
            System.out.println("Arr2 is not Subset of arr");
        }

    }
}
