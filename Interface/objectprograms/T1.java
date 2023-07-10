package com.jsp.objectprograms;

class A
{
	int i;
	int j;
	
	public A(int i, int j)
	{
		this.i = i;
		this.j = j;
	}
	
	@Override
	public String toString()
	{
		return i + " " + j;
	}
}
public class T1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A(10,20);
		A a1 = new A(30,40);
		System.out.println(a.toString());
		System.out.println(a1.toString());
	}
}
