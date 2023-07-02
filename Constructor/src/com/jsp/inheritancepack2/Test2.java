package com.jsp.inheritancepack2;

class E
{
	E()
	{
		System.out.println("No arg con. C");
	}
}

class D extends E
{
	D()
	{
		System.out.println("No arg con. D");
	}
	D(int i)
	{
		System.out.println("1 arg con. D");
	}
}
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new D();
		new D(10);
	
	}

}
