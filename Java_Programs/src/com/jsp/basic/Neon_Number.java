package com.jsp.basic;
/*
 *  9 --> Square => 81 ==> 9 * 9 --> Add --> 8 + 1 = 9
 *  sum == square
 */
import java.util.Scanner;

public class Neon_Number {
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number :");
		num = sc.nextInt();
		int square = num * num;
		int sum = 0;
		 while(square!=0)
		 {
			 int result = square%10;
			 sum = sum + result;
			 square = square / 10;
		 }
		 if(sum == num)
		 {
			 System.out.println("It is a Neon Number");
		 }
		 else
		 {
			 System.out.println("It is not a Niven Number");
		 }
	}
}
