package com.jsp.packinheritance;
class C
{
	static int i = 100;
	static void m1()
	{
		System.out.println("A static method");
	}
}

class D extends C
{
	
}
public class T3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(C.i);
		System.out.println(D.i);
		
		C c1 = new C();
		System.out.println(c1.i);
		
		D d1 = new D();
		System.out.println(d1.i);
		
		C.m1();
		D.m1();
		
		c1.m1();
		d1.m1();
	}
}
