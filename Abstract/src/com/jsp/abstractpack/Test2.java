package com.jsp.abstractpack;

abstract class A2
{
	abstract void m1();
	abstract void m2();
}

abstract class B2 extends A2
{
	@Override
	void m1()
	{
		System.out.println("JSPIDERS JAVA FULL STACK");
	}
}

class C extends B2
{
	@Override
	void m2()
	{
		System.out.println("PYSPIDERS PYTHON FULLSTACK");
	}
}

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A2  a = new C();
		a.m1();
		a.m2();
	}

}
