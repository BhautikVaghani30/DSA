package org.example.String;

public class program_6 {
    public static void main(String[] args) {
//        Update a character in a string (without using .replace() function)
        String str = "hello world";
        char[] c = str.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i] == 'o'){
                c[i] = '0';
            }
        }
        String s = new String(c);
        System.out.println(s);


    }
}
