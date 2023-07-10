package com.jsp.overridingrules;

class A3
{
	{
		System.out.println("Non static Block of A");
	}
	static
	{
		System.out.println("Static Block of A");
	}
	A3()
	{
		System.out.println("Constructor of A");
	}
}

class B3 extends A3
{
	{
		System.out.println("Non Static Block of B");
	}
	static 
	{
		System.out.println("Static Block of B");
	}
	B3()
	{
		System.out.println("Constructor of B");
	}
}
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new B3();

	}

}
