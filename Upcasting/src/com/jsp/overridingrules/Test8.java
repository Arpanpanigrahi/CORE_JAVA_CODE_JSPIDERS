package com.jsp.overridingrules;

class G
{
	int i = 100;
	void m1()
	{
		System.out.println("m1 of class G");
	}
}

class H extends G
{
	int i = 200;
	void m1()
	{
		System.out.println("m1 of class H");
	}
}

public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		G g1 = new G();
		System.out.println(g1.i);
		g1.m1();
		
		G g2 = new H();
		System.out.println(g2.i);
		g2.m1();
	}
}
