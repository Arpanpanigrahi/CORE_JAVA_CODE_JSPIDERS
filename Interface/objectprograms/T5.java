package com.jsp.objectprograms;

interface I
{
	double PI = 3.14;
	void m1();
	void m2();
}

class A5 implements I
{
	@Override
	public void m1()
	{
		
	}
	public void m2()
	{
		
	}
}
public class T5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		I i1 = new A5();
		{
			i1.m1();
			i1.m2();
			
			System.out.println(i1.PI);
			System.out.println(I.PI);
		}
	}

}
