package com.jsp.objectprograms;

public class T4 {
	public static void m1(Object o)
	{
		System.out.println(o.getClass().getSimpleName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		T4 t = new T4();
		//Demo d = new Demo();
		m1(t);
		//m1(d);
	}
}
