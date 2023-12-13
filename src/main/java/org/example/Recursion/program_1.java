package org.example.Recursion;

public class program_1 {
    public static void main(String[] args) {
//        1. Infinite recursive function
        printhello();
    }

    private static void printhello() {
        System.out.println("hello");
        printhello();
    }
}
