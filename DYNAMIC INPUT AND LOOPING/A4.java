/*biggest of 5 nos*/

import java.util.Scanner;
class A4
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		
		if((a>=b) && (a>=c) && (a>=d) && (a>=e)) // a>=b,c,d,e
		{
			System.out.println(a +": is bigger");
		}
		else if((b>=c) && (b>=d) && (b>=e)) // b>=c,d,e
		{
			System.out.println(b +": is bigger");
		}
		else if((c>=d) && (c>=e)) // c>=d,e
		{
			System.out.println(c +": is bigger");
		}
		else if (d>=e) // d>=e
		{
			System.out.println(d +": is bigger");
		}
		else // e>d
		{
			System.out.println(e +": is bigger");
		}
	}
}