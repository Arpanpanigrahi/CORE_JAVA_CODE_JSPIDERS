package com.jsp.exceptioncode;

public class E9 {
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6};
		try {
			System.out.println(a[100]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("Handled-Block-1");
		}
		catch(Exception e) {
			System.out.println("Exception-Block");
		}
	}
}
