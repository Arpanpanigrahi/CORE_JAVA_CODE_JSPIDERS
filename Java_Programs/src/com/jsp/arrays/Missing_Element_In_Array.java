package com.jsp.arrays;
/*
 * INTERVIEW
 */
public class Missing_Element_In_Array {
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 5, 7, 10};
        
        int maxValue = findMaxValue(inputArray);
        
        System.out.print("Missing elements: ");
        for (int i = 1; i <= maxValue; i++) {
            boolean found = false;
            for (int num : inputArray) {
                if (i == num) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.print(i + " ");
            }
        }
    }

    // Helper function to find the maximum value in the array
    private static int findMaxValue(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
