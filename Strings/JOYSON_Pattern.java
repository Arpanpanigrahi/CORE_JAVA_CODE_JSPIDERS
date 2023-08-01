package com.jsp.stringscodes;

public class JOYSON_Pattern {
    public static void main(String[] args) {
        String word = "JOYSON";
        int n = word.length();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(word.charAt(j));
                if (j < i) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}