/* Multiplication table entered by the user */

import java.util.Scanner;
class Tables
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int num = sc.nextInt();
		for(int i=1; i<=10; i++)
		{
			System.out.println(num + " * " + i + " = "+ num * i);
		}
	}
}
			