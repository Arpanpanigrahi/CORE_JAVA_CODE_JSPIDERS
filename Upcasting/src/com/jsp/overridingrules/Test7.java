package com.jsp.overridingrules;

class A7
{
	void m1()
	{
		System.out.println("m1()");
	}
}

class B7 extends A7
{
	void m2()
	{
		System.out.println("m2()");
	}
}

class C7 extends B7
{
	void m3()
	{
		System.out.println("m3()");
	}
}

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A7 a = new C7();
		a.m1();
		
		B7 b = new C7();
		b.m1();
		b.m2();
		
		C7 c = new C7();
		c.m1();
		c.m2();
		c.m3();
		
	}
}
