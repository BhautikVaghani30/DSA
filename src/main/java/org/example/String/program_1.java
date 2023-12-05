package org.example.String;

public class program_1 {
    public static void main(String[] args) {
//        1. Print a string in reverse order
        String str = "this is string";
        for (int i = str.length()-1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }
}
