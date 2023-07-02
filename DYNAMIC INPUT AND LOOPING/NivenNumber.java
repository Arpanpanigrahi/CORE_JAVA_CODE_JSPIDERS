/*Niven Number is a number that is divisible by sum of its digits.
Example- 126
1+2+6 = 9
126 / 9 = Q -> 14 and R -> 0

Logic-
Input Number
extract sum of number
find sum of digits
check sumdivides number or not
display result */

import java.util.Scanner;
class NivenNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int temp = num;
		int sum = 0;
		int digit = 0;
		while(num!=0)
		{
			digit=num%10;
			sum=sum+digit;
			num=num/10;
		}
		if(temp%sum==0)
			System.out.println(temp +"is a Niven Number");
		else
			System.out.println(temp +"is not a Niven Number");
	}
}