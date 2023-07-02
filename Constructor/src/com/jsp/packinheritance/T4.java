package com.jsp.packinheritance;

class E
{
	static
	{
		System.out.println("static block1 of class E");
	}
	{
		System.out.println("non-static block1 of class E");
	}
	{
		System.out.println("non-static block2 of class E");
	}
}

class F extends E
{
	static
	{
		System.out.println("static block1 of class F");
	}
	{
		System.out.println("non-static block1 of class F");
	}
}
public class T4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new F();
		new F();
		new F();
	}
}
