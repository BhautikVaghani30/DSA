package org.example.Recursion;

public class program_2 {
    public static void main(String[] args) {
//        2. Calculate the factorial of a number
        System.out.println(factorial(5));
    }

    private static int factorial(int i) {
        if (i==1){
            return i;
        }
        return i*factorial(i-1);
    }
}
