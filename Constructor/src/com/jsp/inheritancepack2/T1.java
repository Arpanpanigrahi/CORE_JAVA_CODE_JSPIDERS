package com.jsp.inheritancepack2;
class A
{
	int i;
}
class B extends A
{
	int j;
	public void display()
	{
		System.out.println(i+" "+j);
	}
}
public class T1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b1 = new B();
		b1.i=10;
		b1.j=20;
		
		System.out.println(b1.i);
		System.out.println(b1.j);
		
		b1.display();
	}
}
