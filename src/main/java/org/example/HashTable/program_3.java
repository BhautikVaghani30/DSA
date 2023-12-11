package org.example.HashTable;

import java.util.HashMap;

public class program_3 {
    public static void main(String[] args) {
//        3. Count frequency of each number in array
        int[] arr = {
                1,2,3,4,5,2,2,3,2,5,3,4,2,3,1,3,2,5
        };
        HashMap<Integer,Integer> map = new HashMap<>();
        int x=0;
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1 );
            }else {
                map.put(arr[i], 1);
            }
        }
        System.out.println(map);
    }
}
