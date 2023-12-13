package org.example.Recursion;

public class program_11 {
    private static int n1 = 0;
    private static int n2 = 1;
    private static int n3 = 0;

    private static int i = 2;
    public static void main(String[] args) {
//        11. Print nth number in fibonacci series using recursion
        int count = 10;
        System.out.println(fibonacci(count, i));
    }

    private static int fibonacci(int count , int i) {
        if (count == i ){
            return n3;
        }
        n3=n1+n2;
        n1=n2;
        n2=n3;
        i++;
        System.out.println(n3);
        n3=fibonacci(count,i);
        return n3;
    }
}
