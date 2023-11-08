package com.jsp.strings;

public class Add_Two_Numbers_Without_Arithmetic_Operator {
    public static int add(int a, int b) {
        while (b != 0) {
            int carry = a & b; // Calculate the carry
            a = a ^ b;         // XOR operation to add without carry
            b = carry << 1;    // Left shift the carry to simulate addition
        }
        return a;
    }

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 7;

        int sum = add(num1, num2);
        System.out.println("Sum: " + sum);
    }
}
