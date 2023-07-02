/*Smallest of 4 numbers using nested if */

class Smallestof3
{
	public static void main(String[] args)
	{
		int a = 1000;
		int b = 15;
		int c = 120;
		if(a <  b)
		{
			if(a < c)
				System.out.println(a +"is smaller");
			else 
				System.out.println(c +"is smaller");
		}
		else if(b < c)
			System.out.println(b +"is smaller");
		else
			System.out.println(c +"is smaller");
	}
}