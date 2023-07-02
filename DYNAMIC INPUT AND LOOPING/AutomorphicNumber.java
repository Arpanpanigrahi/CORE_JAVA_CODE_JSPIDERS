/*Automorphic Number is a number whose square ends with the same digits as the number itself.*/
import java.util.Scanner;
class AutomorphicNumber
{
	public static void main(String[] args)
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		n = sc.nextInt();
		
		if(n*n%10==n || n*n%100==n || n*n%1000==n)
		{
			System.out.println(n+ "is an automorphic Number");
		}
		else
		{
			System.out.println(n+ "is not an automorphic Number");
		}
	}
}
			
