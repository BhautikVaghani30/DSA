package org.example.Recursion;

public class program_7 {
    private static int i = 1 ;
    private static int sum = 0;
    public static void main(String[] args) {
//        7. calculate the product of two numbers using recursion
        int x = 10;
        int y = 20;
        System.out.println(product(x,y));

    }

    private static int product(int x, int y) {
        if (i > y){
            return sum;
        }
        sum+=x;
        i++;
        sum=product(x,y);
        return sum;

    }

}
