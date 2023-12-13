package org.example.Recursion;

public class program_6 {
    public static void main(String[] args) {
//        6. reverse an integer number using recursion
        int n = 432125645;
        reverse(n);

    }

    private static void reverse(int n) {
        if (n<=0){
            return;
        }
        System.out.print(n%10);
        reverse(n/=10);
    }
}
