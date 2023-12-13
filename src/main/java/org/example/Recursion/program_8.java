package org.example.Recursion;

public class program_8 {
    private static int sum = 0;
    public static void main(String[] args) {
//      8. find the sum of digits of a number using recursion
        int n = 1234;
        System.out.println(sum(n));
    }

    private static int sum(int n) {
        if (n<=0){
            return sum;
        }
        sum += n%10;;
        sum = sum(n/=10);

        return sum;
    }
}
