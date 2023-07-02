/* Count the even and odd numbers ex- 12653 even-2 odd-3 */

import java.util.Scanner;
class OddEven
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int value; 
		int evencount=0;
		int oddcount=0;
		
		System.out.println("Enter a number: ");
		value = sc.nextInt();
		
		while(value>0)
		{
			if(value%2==0)
				evencount++;
			else
				oddcount++;
			value=value/10;
		}
		System.out.println("Even: "+evencount);
		System.out.println("Odd :"+oddcount);
	}
}
			
		