package org.example.String;

public class program_7 {
    public static void main(String[] args) {
//        Sort string of characters
        String input = "dcba";
        char[] charArray = input.toCharArray();

        for (int i = 0; i < charArray.length - 1; i++) {
            for (int j = 0; j < charArray.length - i - 1; j++) {
                if (charArray[j] > charArray[j + 1]) {
                    // Swap characters if they are in the wrong order
                    char temp = charArray[j];
                    charArray[j] = charArray[j + 1];
                    charArray[j + 1] = temp;
                }
            }
        }

        String sortedString = new String(charArray);
        System.out.println(sortedString);

    }
}
