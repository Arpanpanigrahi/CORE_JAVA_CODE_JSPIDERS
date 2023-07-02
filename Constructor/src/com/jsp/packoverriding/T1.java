package com.jsp.packoverriding;

class A
{
	public void wish()
	{
		System.out.println("Good Morning");
	}
}

class B extends A
{
	public void wish()
	{
		System.out.println("Good Evening");
	}
}
public class T1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		b.wish();

	}

}
