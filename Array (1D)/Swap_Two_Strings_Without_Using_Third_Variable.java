package com.jsp.arrayscode;

public class Swap_Two_Strings_Without_Using_Third_Variable {
	public static void main(String[] args) {
		String a = "Jspider";
		String b = "Pyspider";
		a =a + b;
		b = a.substring(0,a.length()-b.length());
		a = a.substring(b.length());
		System.out.println(a+" "+b);	
	}
}
