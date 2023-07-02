package com.jsp.inheritancepack2;

class A2
{
	int i;
	public void m1()
	{
		System.out.println("Data: " +i);  // +i = this.i
	}
}

class B2 extends A2
{
	int j;
	public void m2()
	{
		System.out.println("i: " +i + "j: " +j);
	}
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B2 b1 = new B2();
		System.out.println(b1.i);
		b1.m1();
		System.out.println(b1.j);
		b1.m2();
	}
}
