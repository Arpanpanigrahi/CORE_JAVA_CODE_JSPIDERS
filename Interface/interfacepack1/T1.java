package com.jsp.interfacepack1;

interface I
{
	void m1();
	void m2();
}

class A implements I
{
	@Override
	public void m1()
	{
		System.out.println("m1 implemented for class A");
	}
	
	@Override
	public void m2()
	{
		System.out.println("m2 implemented for class B");
	}
}

public class T1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		I i1;
		i1 = new A();
		i1.m1();
		i1.m2();
	}
}
