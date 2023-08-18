//finally
package com.jsp.exceptioncode;

public class E11 {
	public static void main(String[] args) {
		System.out.println("Main Open");
		try {
			System.out.println(10/2);
			return;
		}catch(ArithmeticException e) {
			System.out.println("Handled");
		}finally {
			System.out.println("Main Closed");
		}
	}
}
