package com.jsp.abstractpack;

abstract class A
{
	abstract void m1();
	void m2()
	{
		System.out.println("M2()");
	}
}

class B extends A
{
	void m1()
	{
		System.out.println("M1()");
	}
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new B();
		a.m1();
		a.m2();
	}
}
