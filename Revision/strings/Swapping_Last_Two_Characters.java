package com.jsp.strings;

public class Swapping_Last_Two_Characters {
    public static String swapLastTwoChars(String str) {
        if (str.length() < 2) {
            return str;
        }

        return str.substring(0, str.length() - 2) + str.charAt(str.length() - 1) + str.charAt(str.length() - 2);
    }

    public static void main(String[] args) {
        String originalString = "Hello";
        String swappedString = swapLastTwoChars(originalString);
        System.out.println("Original: " + originalString);
        System.out.println("Swapped: " + swappedString);
    }
}
