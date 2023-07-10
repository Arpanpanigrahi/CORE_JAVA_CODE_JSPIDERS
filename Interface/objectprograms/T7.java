package com.jsp.objectprograms;

interface I7
{
	void m1();
	default void m2()
	{
		System.out.println("default method of inheritance");
	}
	
	static void m3()
	{
		System.out.println("static method of interface");
	}
}

class A7 implements I7
{
	@Override
	public void m1()
	{
		System.out.println("m1() of class A");
	}
	
	//default method not overridden
}

class B7 implements I7
{
	@Override
	public void m1()
	{
		System.out.println("m1() of class B");
	}
	
	@Override
	public void m2()
	{
		System.out.println("default method overridden in class B");
	}
}

public class T7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		I7 i1;
		i1 = new A7();
		i1.m1();
		i1.m2();
		
		i1 = new B7();
		i1.m1();
		i1.m2();
		I7.m3();

	}

}
