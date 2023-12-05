package org.example.String;

public class program_4 {
    public static void main(String[] args) {
//        count number of words in a String (with / without split function)
        String str = "this is string";
        int c = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' '){
                c++;
            }
        }
        c++;
        System.out.println(c);

//        with split function
        String[] s = str.split(" ");
        System.out.println(s.length);
    }
}
