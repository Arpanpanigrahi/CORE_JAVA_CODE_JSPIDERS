package com.jsp.constructorpack;

class F
{
	int i;
	F(int i)
	{
		this.i = i;
	}
	
	F(F f) //copy constructor
	{
		this.i =f.i;
	}
}
public class CopyConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		F f1 = new F(100);
		System.out.println(f1.i);
		
		F f2 = new F(f1);
		System.out.println(f2.i);
	}
}
