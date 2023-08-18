//try-catch block
package com.jsp.exceptioncode;

public class E4 
{
	public static void main(String[] args) 
	{
		System.out.println("Main Start..");
		int a[] = {1,2,3,4,5,6};
		try{
			System.out.println(a[4]);
			System.out.println("Array..");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("-1");
		}
		System.out.println("Main End..");
	}
}

	
