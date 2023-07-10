package com.jsp.downcast;

class A2
{
	int i = 100;
}

class B2 extends A2
{
	int i =500;
}

public class Test2 
{
	public static void main(String[] args) {
		A2 a = new B2();
		System.out.println(a.i);
		
		System.out.println(((B2)a).i);
	}

}
