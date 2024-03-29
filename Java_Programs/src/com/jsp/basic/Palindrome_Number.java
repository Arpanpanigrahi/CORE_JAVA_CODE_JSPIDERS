package com.jsp.basic;
/*
 * INTERVIEW
 */
import java.util.Scanner;

public class Palindrome_Number {
	public static void main(String[] args) {
		int num,rev=0,rem,temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number :");
		num = sc.nextInt();
		temp=num;
		 while(temp!=0)
		 {
			 rem=temp%10;
			 rev=(rev*10)+rem;
			 temp=temp/10;
		 }
		 if(num==rev)
			 System.out.println("Palindrome Number");
		 else
			 System.out.println("Not a Palindrome Number");
	}
}
