package com.jsp.pack1;

class A
{
	private int i;
	{
		i = 10;
	}
	public void accessI()
	{
		System.out.println("i" +i);
	}
}

class B extends A
{
	public void m1()
	{
		accessI();
	}
}
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi");
		A a = new A();
		a.accessI();
		
		B b = new B();
		b.accessI();
		b.m1();
	}
}
