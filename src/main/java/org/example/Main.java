package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String title = "FIrsT leTTeR of EACH Word";
        String[] str = title.split(" ");
//        String s = str[0].substring(0,1).toUpperCase();
//        String l = str[0].substring(1,str[0].length()).toLowerCase();
//        String word = s+l;
//        System.out.println(word);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length; i++) {
            if (str[i].length() == 1 || str[i].length() == 2) {

                sb.append(str[i].toLowerCase() + " ");
                continue;
            }
            String s = str[i].substring(0,1).toUpperCase();
            String l = str[i].substring(1,str[i].length()).toLowerCase();
            String word = s+l;
            sb.append(word + " ");
        }
        System.out.println(sb.toString());
    }

}