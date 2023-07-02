package com.jsp.inheritancepack2;

class A1
{
	static
	{
		System.out.println("SB1");
	}
	{
		System.out.println("N.S-B1 OF CLASS A");
	}
	A1()
	{
		System.out.println("NO-ARG CONST. OF CLASS A");
	}
}

class C extends A1
{
	static
	{
		System.out.println("SUBCLASS SB1");
	}
	{
		System.out.println("SUBCLASS NS B1");
	}
	C()
	{
		System.out.println("N0-ARG CONST. OF CLASS B");
	}
}
public class Testt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new C();

	}

}
