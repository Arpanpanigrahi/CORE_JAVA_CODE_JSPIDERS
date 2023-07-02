package com.jsp.filehandling;

public class Demo {
	static int i;
	int j;
	
	Demo(int i, int n)
	{
		this.i = i;
		j = n;
	}
	
	public static void main(String[] args)
	{
		Demo d = new Demo(10,30);
		System.out.println(d.i+" "+d.j);
		Demo d1 = new Demo(40,60);
		System.out.println(d1.i+" "+d1.j);
		System.out.println(d.i+" "+d.j);
	}
}
