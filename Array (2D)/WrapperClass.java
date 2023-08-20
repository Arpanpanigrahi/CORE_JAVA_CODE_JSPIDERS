package com.jsp.arrayprgs;

public class WrapperClass {
	public static void main(String[] args) {
		m1("abcd");
		m1(10);
		m1('a');
		m1(new WrapperClass());
	}
	
	static void m1(Object a)
	{
		System.out.println("m1()");
	}
}
