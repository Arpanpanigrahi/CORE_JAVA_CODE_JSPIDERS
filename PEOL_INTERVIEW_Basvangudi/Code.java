package com.jsp.basvangudi;
//input - Bangalore Bangalore Bangalore is Bangalore Bangalore my city
//output - Bangalore is Bangalore my city
public class Code {
    public static void main(String[] args) {
        String input = "Bangalore Bangalore Bangalore is Bangalore Bangalore ";
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();
        String prevWord = null;
        for (String word : words) {
            if (!word.equals(prevWord)) {
                result.append(word).append(" ");
            }
            prevWord = word;
        }
        String output = result.toString().trim();
        System.out.println(output);
    }
}