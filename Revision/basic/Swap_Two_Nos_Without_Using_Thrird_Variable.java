package com.jsp.basic;

public class Swap_Two_Nos_Without_Using_Thrird_Variable {
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		System.out.println("Before Swapping");
		System.out.println("Value of x is :" +x);
		System.out.println("Value of y is :" +y);
		
		x = x + y;
		y = x - y;
		x = x - y;
		
		System.out.println("After Swapping");
		System.out.println("Value of x is :" +x);
		System.out.println("Value of y is :" +y);
	}
}
