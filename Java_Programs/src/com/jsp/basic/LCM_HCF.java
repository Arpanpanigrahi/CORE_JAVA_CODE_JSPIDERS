package com.jsp.basic;

import java.util.Scanner;

public class LCM_HCF {
	public static void main(String[] args) {
		//GCD(HCF)
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number :");
		int num1 = sc.nextInt();
		System.out.println("Enter Second Number :");
		int num2 = sc.nextInt();
		 int gcd = 1;
		 for(int i=1; i<=num1 && i<=num2; i++)
		 {
			 if(num1%i==0 && num2%i==0)
				 gcd = i;
		 }
		 System.out.println("GCD of two numbers is :" +gcd);
		 
		 int lcm = (num1*num2)/gcd;
		 System.out.println(lcm);
	}
}
