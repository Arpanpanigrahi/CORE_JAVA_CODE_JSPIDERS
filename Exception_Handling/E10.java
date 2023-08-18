//finally
package com.jsp.exceptioncode;

public class E10 {
	public static void main(String[] args) {
		System.out.println("Main Open");
		try {
			System.out.println(10/2);
		}finally {
			System.out.println("Main Closed");
		}
	}
}
