//Single Level Inheritance
package com.jsp.packinheritance;
class A
{
	int i = 19;
	void m1()
	{
		System.out.println("m1() called");
	}
}
class B extends A
{
	int j = 78;
	void m2()
	{
		System.out.println("m2() called");
	}
}
public class T1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//recommended
		B b = new B();
		System.out.println(b.i);
		System.out.println(b.j);
		b.m1();
		b.m2();
	}
}
