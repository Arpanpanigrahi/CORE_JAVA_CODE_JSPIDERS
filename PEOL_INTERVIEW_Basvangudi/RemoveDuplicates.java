package com.jsp.basvangudi;
// input - Bangalore Bangalore Bangalore is Bangalore Bangalore my city
public class RemoveDuplicates {
    public static void main(String[] args) {
        String input = "Bangalore Bangalore Bangalore is Bangalore Bangalore my city";
        StringBuilder output = new StringBuilder();
        boolean isDuplicate = false;

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            // Check if the current character is a letter
            if (Character.isLetter(currentChar)) {
                int j = i + 1;
                while (j < input.length() && Character.isLetter(input.charAt(j))) {
                    j++;
                }
                String word = input.substring(i, j);

                // Checking Bangalore is Duplicate or not
                if (word.equals("Bangalore") && !isDuplicate) {
                    output.append(word).append(" ");
                    isDuplicate = true;
                } else if (!word.equals("Bangalore")) {
                    output.append(word).append(" ");
                    isDuplicate = false;
                }

                // Update the index
                i = j - 1;
            } else {
                output.append(currentChar);
            }
        }

        // Remove trailing space and print the final output
        String finalOutput = output.toString().trim();
        System.out.println(finalOutput);
    }
}

