package com.jsp.blocks;

class A1
{
	static int count = 0;
	{
		count++;
	}
}
public class CountObjects {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 a1 = new A1();
		A1 a2 = new A1();
		A1 a3 = new A1();
		
		System.out.println(A1.count);
	}

}
