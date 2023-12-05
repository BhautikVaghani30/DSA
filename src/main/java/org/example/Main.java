package org.example;

public class Main {
    public static void main(String[] args) {
        String s = "0P";
        s=s.toLowerCase();
        System.out.println(s);
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i<s.length(); i++){
            int asci = s.charAt(i);
            if(asci >= 97 && asci <= 122) sb.append(s.charAt(i));

        }
        String str = sb.toString();
        System.out.println(str);
        char[] c = str.toCharArray();
        int n = c.length;
        for(int i = 0; i<n/2; i++)
        {
            if(c[i] != c[n-i-1]){
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
    }
}