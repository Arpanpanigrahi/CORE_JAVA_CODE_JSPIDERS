package com.jsp.basic;

import java.util.Scanner;

/*
 *  input no -> 6 -> 1,2,3,4,5
 *  6 --> completely divisible by 6 --> 1,2,3
 *  add --> 1+2+3 --> 6
 *  number == sum
 */
public class Perfect_Number {
	public static void main(String[] args) {
		int num,sum=0;
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		for(int i=1; i<=num/2; i++)
		{
			if(num%i==0)
				sum=sum+i;
		}
		if(num==sum)
			System.out.println(num+ "is a Perfect Number");
		else
			System.out.println(num+ "is not a Perfect Number");
	}
}
