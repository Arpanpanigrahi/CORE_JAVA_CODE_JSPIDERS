package com.jsp.basic;
// 0 1 1 2 3 5
public class Fibonacci {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		System.out.println(a+ "\n" +b);
		
		for(int i=1; i<=8; i++)
		{
			int c = a + b;
			System.out.println(c);
			a = b;
			b = c;
		}
	}
}
