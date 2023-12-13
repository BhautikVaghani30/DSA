package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        String[] str = {"5","2","C","D","+"};
        char[] crr = new char[str.length];


        for (int i = 0; i < str.length; i++) {
            crr = str[i].toCharArray();
            int asci = crr[0];

            if (stack.isEmpty()){
                int n = Integer.parseInt(String.valueOf(asci));
                System.out.println(n);
                stack.push(48-n);
            }
            if (asci>=48 && asci <= 57){
                int n = Integer.parseInt(String.valueOf(asci));
                stack.push(48-n);
            } else if (asci == 67) {
                stack.pop();
            } else if (asci == 68) {
                stack.push(stack.peek()*2);
            } else if (asci == 43) {
                int curr = stack.peek();
                stack.pop();
                int sum = stack.peek() + curr;
                stack.push(curr);
                stack.push(sum);
            }
        }
        int sum = 0;
        while (!stack.isEmpty()){
            sum+=stack.pop();
        }
        System.out.println(sum);
    }
}