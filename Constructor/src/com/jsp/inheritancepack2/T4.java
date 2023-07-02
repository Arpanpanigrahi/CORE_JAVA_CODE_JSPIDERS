package com.jsp.inheritancepack2;

class G
{
	G(int i)
	{
		System.out.println("G con. executed");
	}
}

class H1 extends G
{
	H1()
	{
		super(10);  //explicit call to constructor if there is param. 
					//const in super class
		
	}
}
public class T4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new H1();

	}

}
