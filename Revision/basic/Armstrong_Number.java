/*
 * INTERVIEW
 */
package com.jsp.basic;

import java.util.Scanner;

//input--> 153 --> 1*1*1 + 5*5*5 + 3*3*3 = 153
public class Armstrong_Number {
	public static void main(String[] args) {
		int n,arm=0,rem,c;
		System.out.println("Enter a Number :");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		c=n;
		
		while(n>0)
		{
			rem=n%10;
			arm=(rem*rem*rem)+arm;
			n=n/10;
		}
		if(c==arm)
			System.out.println("Armstrong Number");
		else
			System.out.println("Not a Armstrong Number");
	}
}
