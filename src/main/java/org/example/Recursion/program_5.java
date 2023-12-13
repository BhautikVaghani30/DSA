package org.example.Recursion;

public class program_5 {
    private static int c = 0;
    public static void main(String[] args) {
//        5. Count the digits of a given number using recursion
        int n = 123234;
        System.out.println(count(n));
    }

    private static int count(int n) {
        if (n==0){
            return c;
        }
        c++;
        c=count(n/=10);
      return c;
    }
}
