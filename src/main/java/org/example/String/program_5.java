package org.example.String;

public class program_5 {
    public static void main(String[] args) {
        //    Program to check if two strings are same or not (without using inbuilt function .equals())
        String s = "hello";
        String s2 = "el0o";
        for(int i = 0; i<s.length(); i++){
            if(s != s2){
                System.out.println("not equal");
                return;
            }
        }
        System.out.println("equal");
        return;
    }

}
