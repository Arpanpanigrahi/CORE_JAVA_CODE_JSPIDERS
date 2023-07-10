package com.jsp.downcast;

class A
{
	void m1()
	{
		System.out.println("m1() of class A");
	}
}

class B extends A
{
	@Override
	public void m1()
	{
		System.out.println("m1() of class B");
	}
	
	public void m2()
	{
		System.out.println("m2() of class B --> specific method");
	}
}

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new B();
		a.m1();
		
		B b = (B) a;
		b.m2();
	}
}
