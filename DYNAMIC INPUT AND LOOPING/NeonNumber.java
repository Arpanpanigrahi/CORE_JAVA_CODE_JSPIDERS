/* Neon Number means Number=9 its square is 81=9+9--> So its a Neon Number (Sum==Square)*/

import java.util.Scanner;
class NeonNumber
{
	public static void main(String[] args)
	{
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		num = sc.nextInt();
		int square = num * num;
		int sum = 0;
		
		while(square!=0)
		{
			int result = square%10;
			sum = sum + result;
			square = square/10;
		}
		if(sum==num)
		{
			System.out.println("It is a Neon Number");
		}
		else
		{
			System.out.println("It is not a Neon Number");
		}
	}
}




/*
import java.util.Scanner;
class NeonNumber 
{
	public static void main(String[] args)
	{
		int n,square,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: " );
		n=sc.nextInt();

		square=n*n;

		while(square!=0)
		{
			sum=sum+square%10;
			square=square/10;
		}
		
		if(sum==n)
			System.out.println("Its a Neon number.");
		else
			System.out.println("Its not a Neon number.");
	}
}

*/