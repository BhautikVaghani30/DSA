package org.example.String;

public class program_2 {
    public static void main(String[] args) {
//        Reverse a String
        String str = "this is string";
        char[] crr = str.toCharArray();
        int n = crr.length;
        for (int i = 0; i < n/2; i++) {
            char t = crr[i];
            crr[i] = crr[n-i-1];
            crr[n-i-1] = t;
        }
        String string = new String(crr);
        System.out.println(string);
    }

}
