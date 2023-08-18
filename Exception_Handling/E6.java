package com.jsp.exceptioncode;

public class E6 {
	public static void main(String[] args) {
		try
		{
			System.out.println(10/0);
		}catch(ArithmeticException e){
			System.out.println("Handled.. Block-1");
			int a = 100;
			int b = 10;
			int res = a % b;
			
			try {
				System.out.println(a/res);
			}catch(ArithmeticException l) {
				System.out.println("Handled.. Block-2");
			}
		}
	}
}
