package org.example.String;

public class program_8 {
    public static void main(String[] args) {
//        Print frequency of all the characters in string
        int c = 0;
        String s = "this is string";
        char[] crr = s.toCharArray();
        for (int i = 0; i < crr.length; i++) {
            if (crr[i] == '0') continue;
            c=0;
            for (int j = i+1; j < crr.length; j++) {
                if (crr[i] == crr[j]){
                    c++;
                    crr[i] = '0';
                }
            }
            System.out.println(crr[i] + " frequency : " + c);
        }
    }
}
