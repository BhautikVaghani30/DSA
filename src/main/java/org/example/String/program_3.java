package org.example.String;

public class program_3 {
    public static void main(String[] args) {
//        check if a String is Palindrome?
        String str = "noon";
        int n = str.length();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(n-i-1)){
                System.out.println("not palindrom");
                return;
            }
        }
        System.out.println("palindrom");
        return;


    }
}
