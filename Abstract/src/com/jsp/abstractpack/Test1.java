package com.jsp.abstractpack;

abstract class A1
{
	int i;
	static int j;
	
	static final int k;
	final int l;
	
	static
	{
		k = 300;
		j = 200;
	}
	
	//non- static block
	{
		l = 400;
		i = 100;
	}
	
	A1()
	{
		System.out.println("Abstract class constructor called");
	}
	
	abstract public void abmethod();
	
	private void pm()
	{
		System.out.println("private method");
	}
	
	final void fm()
	{
		pm();
		System.out.println("final method called");
	}
	
	static void sm()
	{
		System.out.println("static method called");
	}
	
	void nsm()
	{
		pm();
		System.out.println("ns method executed");	
	}
}

class B1 extends A1
{
	public void abmethod()
	{
		System.out.println("overridden method executed");
	}
	
}

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 a = new B1();
		System.out.println(a.i);
		System.out.println(A1.j);
		System.out.println(A1.k);
		System.out.println(a.l);
		
		a.abmethod();
		A1.sm();
		a.fm();
		a.nsm();
	}
}
