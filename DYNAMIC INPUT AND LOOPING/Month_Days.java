/* Write a java program to print number of days in a month using switch case statement */

import java.util.Scanner;
class Month_Days 
{
		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number :");
			int num = sc.nextInt();
			switch (num)
			{
				case 1:
				case 3:
				case 7:
				case 8:
				case 10:
				case 12:
				System.out.println("31 days");
				break;
				
				case 2:
				System.out.println("28 days");
				break;
				
				case 4:
				case 5:
				case 6:
				case 9:
				case 11:
				System.out.println("30 days");
				break;
			}
		}
}