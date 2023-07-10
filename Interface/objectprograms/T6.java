package com.jsp.objectprograms;

interface I1
{
	void m1();
	void m2();
}

interface J
{
	void m2();
	void m3();
}

class A6 implements I1,J
{
	@Override
	public void m1()
	{
		System.out.println("m1");
	}
	
	@Override
	public void m2()
	{
		System.out.println("m2");
	}
	
	@Override
	public void m3()
	{
		System.out.println("m3");
	}
}

public class T6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		I1 i = new A6();
		i.m1();
		i.m2();
		
		J j = new A6();
		j.m2();
		j.m3();
	}
}
