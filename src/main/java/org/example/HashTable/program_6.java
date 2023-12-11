package org.example.HashTable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class program_6 {
    public static void main(String[] args) {
//        6. Check if two arrays are equal or not
        int[] arr1 = {
                1,2,3,4,5
        };
        int[] arr2 = {
                5,4,3,2,1
        };
        Set<Integer> set = new HashSet<>();
        int l1 = arr1.length;
        int l2 = arr2.length;
        if (l1 != l2){
            System.out.println("not same");
            return;
        }
        int c = 0;
        for (int i = 0; i < l2; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < l2; i++) {
            if (!set.add(arr2[i])){
                c++;
            }
        }
        if (c == set.size()){
            System.out.println("same");
        }else{
            System.out.println("not same");
        }
    }
}
