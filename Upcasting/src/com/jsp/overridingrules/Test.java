package com.jsp.overridingrules;

class A
{
	public void m1()
	{
		System.out.println("M1 OF A");
	}
}

class B extends A
{
	@Override
	public void m1()
	{
		System.out.println("M1 OF B");
	}
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new B(); //Upcasting
		a.m1();
	}
}
