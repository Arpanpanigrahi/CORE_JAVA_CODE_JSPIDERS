package com.jsp.bindingpack;

class A
{
	static void m1()
	{
		System.out.println("M1 OF CLASS A");
	}
}

class B extends A
{
	static void m1()
	{
		System.out.println("M1 OF CLASS B");
	}
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A.m1();
		B.m1();
		
		A a1;
		a1 = new A();
		a1.m1();
		
		a1 = new B();
		a1.m1();
	}
}
