package org.example.Recursion;

public class program_3 {
    public static void main(String[] args) {
//        3. Sum of 1 to n numbers
        System.out.println(sum(10));
    }

    private static int sum(int i) {
        if (i==0){
            return i;
        }
        int cal = i + sum(i-1);
        return cal;
    }
}
