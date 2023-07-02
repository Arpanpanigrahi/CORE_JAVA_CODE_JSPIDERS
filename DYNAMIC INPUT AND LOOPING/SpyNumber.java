/*Spy Numbers--> 
123 --> 1 + 2 + 3 = 6
		1 * 2 * 3 = 6
Input number
Extract digits of a number
find sum of digits
find product of digits
compare sum and product
display result
*/

import java.util.Scanner;
class SpyNumber
{
	public static void main(String[] args)
	{
		System.out.println("Enter any number :");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int temp=num;
		int sum=0;
		int product=1;
		int digit=0;
		
		while(num!=0)
		{
			digit=num%10;
			sum=sum+digit;
			product=product*digit;
			num=num/10;
		}
		if(sum==product)
			System.out.println(num+"is a Spy Number");
		else
			System.out.println(num+"is not a Spy Number");
	}
}
			