/* Write a java program to print number of days in a month using switch case statement */

import java.util.Scanner;
class MonthDays 
{
		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a Month number :");
			int month = sc.nextInt();
			switch (month) 
			{
            case 1:
                System.out.print("Number of Days 31");
				break;
            case 2:
                System.out.println("Number of Days 28 or 29");
                break;
            case 3:
                System.out.println("Number of Days 31");
                break;
            case 4:
                System.out.println("Number of Days 30");
                break;
            case 5:
                System.out.println("Number of Days 31");
                break;
            case 6:
                System.out.println("Number of Days 30");
                break;
            case 7:
                System.out.println("Number of Days 31");
                break;
			case 8:
                System.out.println("Number of Days 31");
                break;
            case 9:
                System.out.println("Number of Days 30");
                break;
            case 10:
                System.out.println("Number of Days 31");
                break;
            case 11:
                System.out.println("Number of Days 30");
                break;
            case 12:
                System.out.println("Number of Days 31");
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
}
