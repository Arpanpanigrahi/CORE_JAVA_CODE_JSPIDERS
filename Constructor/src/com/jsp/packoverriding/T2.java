package com.jsp.packoverriding;

class Parent
{
	public void TVS()
	{
		System.out.println("TVS HEAVY DUTY");
	}
}

class Child extends Parent
{
	public void TVS()
	{
		System.out.println("TVS APACHE");
	}
}


public class T2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child m1 = new Child();
		m1.TVS();

	}

}
