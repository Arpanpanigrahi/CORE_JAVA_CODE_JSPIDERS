package com.jsp.exceptioncode;

public class E8 {
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6};
		try {
			System.out.println(a[100]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Handled-Block-2");
		}catch(Exception e) {
			System.out.println("Exception-Block");
		}
	}
}
