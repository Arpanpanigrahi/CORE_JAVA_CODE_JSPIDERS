/*1. Write a java program to find the biggest of 2 numbers using if else statements */

import java.util.Scanner;
class A1
{
	public static void main(String args[])
	{
		int num1,num2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of number1");
		num1=sc.nextInt();
		System.out.println("Enter the value of number2");
		num2=sc.nextInt();
		if(num1>num2)
		{
			System.out.println("Number1 is greater than Number2");
		}
		else 
		{
			System.out.println("Number2 is greater than Number1");
		}
	} 
}