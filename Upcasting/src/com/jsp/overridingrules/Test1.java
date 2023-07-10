package com.jsp.overridingrules;

class A1
{
	public static void m1()
	{
		System.out.println("M1 OF A1");
	}
}

class B1 extends A1
{
	public static void m1()
	{
		System.out.println("M1 OF B1");
	}
}

class C extends B1
{
	public static void m1()
	{
		System.out.println("M1 OF C");
	}
}

class D extends B1
{
	public static void m2()
	{
		System.out.println("M2 OF D");
	}
}

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 a = new B1(); 
		a.m1();
		A1 b = new C(); 
		b.m1();
		B1 c = new C(); 
		c.m1();
		D d = new D(); 
		d.m1();
		//d.m2();
	}
}