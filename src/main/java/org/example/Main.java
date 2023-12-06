package org.example;

public class Main {
    public static void main(String[] args) {
        int n = 20;
        int j=1;
        int sum = 0;
        int k = 2;
        int d = 7;
        for (int i = 0; i < n; i++) {
            if (i==d){
                j=k;
                k++;
                d+=7;

            }
            sum += j;
            j++;
        }
    }
}