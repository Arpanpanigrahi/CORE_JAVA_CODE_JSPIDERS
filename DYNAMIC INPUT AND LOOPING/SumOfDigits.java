/* Sum of the digits of a number */

import java.util.Scanner;
class SumOfDigits
{
   public static void main(String[] args)
   {
      int num, digit, sum=0;
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Enter a Number: ");
      num = sc.nextInt();
      
      while(num!=0)
      {
         digit = num%10;
         sum = sum + digit;
         num = num/10;
      }
      
      System.out.println("Sum of Digits = " +sum);
   }
}