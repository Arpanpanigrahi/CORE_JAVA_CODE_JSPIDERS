/*Reverse number */

import java.util.Scanner;
class ReverseNumber
{
	public static void main(String[] args)
	{
		int a, result=0, n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		n=sc.nextInt();
		
		while(n!=0)
		{
			a=n%10;
			result=(result*10)+a;
			n=n/10;
		}
		System.out.println("Reverse of a number: "+result);
	}
}