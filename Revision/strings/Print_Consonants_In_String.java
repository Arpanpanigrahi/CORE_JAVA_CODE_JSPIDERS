package com.jsp.strings;

public class Print_Consonants_In_String {
    public static void main(String[] args) {
        String input = "Hello, World!";
        input = input.toLowerCase(); // Convert the string to lowercase for case-insensitive comparison

        System.out.print("Consonants in the string: ");
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (isConsonant(ch)) {
                System.out.print(ch);
            }
        }
    }

    public static boolean isConsonant(char ch) {
        return (ch >= 'a' && ch <= 'z') && "aeiou".indexOf(ch) == -1;
    }
}
