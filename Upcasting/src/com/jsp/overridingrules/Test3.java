package com.jsp.overridingrules;

class A4
{
	public void m1()
	{
		System.out.println("M1 OF A");
	}
}

class B4 extends A4
{
	@Override
	public void m1()
	{
		System.out.println("M1 OF B");
	}
}

class C4 extends B4
{
	@Override
	public void m1()
	{
		System.out.println("M1 OF C");
	}
}
public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A4 a = new C4(); //upcasting
		a.m1();
		
		System.out.println("*********************");
		
		B4 b = new C4();
		b.m1();
	}
}