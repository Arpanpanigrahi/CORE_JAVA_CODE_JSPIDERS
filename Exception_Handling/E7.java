package com.jsp.exceptioncode;

public class E7 {
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6};
		try
		{
			try
			{
				System.out.println(a[2]);
				System.out.println(10/0);
			}catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Handled-Block-1");
			}
			catch(ArithmeticException e)
			{
				System.out.println("Arithmetic-Block-0");
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("Handled-Block-2");
		}
	}
}
