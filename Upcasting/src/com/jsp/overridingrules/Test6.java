package com.jsp.overridingrules;

class A6
{
	int i = 100;
	
	public void m1()
	{
		System.out.println("A6 m1()");
	}
}

class B6 extends A6
{
	int j = 200;
	
	public void m2()
	{
		System.out.println("B6 m2()");
	}
}

class C6 extends A6
{
	int k = 400;
	
	public void m3()
	{
		System.out.println("C6 m3()");
	}
}
public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A6 a;
		a = new A6();
		System.out.println(a.i);
		a.m1();
		
		a = new B6();
		System.out.println(a.i);
		a.m1();
		
		a = new C6();
		System.out.println(a.i);
		a.m1();
		
//		A6 a = new A6();
//		System.out.println(a.i);
//		a.m1();
//		
//		a = new B6();
//		System.out.println(a.i);
//		a.m1();
//		
//		a = new C6();
//		System.out.println(a.i);
//		a.m1();
	}
}
