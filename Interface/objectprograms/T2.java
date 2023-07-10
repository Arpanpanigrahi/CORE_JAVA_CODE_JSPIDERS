package com.jsp.objectprograms;

class A1
{
	String name;
	int age;
	long number;
	
	public A1(String name, int age, long number)
	{
		this.name = name;
		this.age = age;
		this.number = number;
	}
	
	@Override
	public String toString()
	{
		return name + " " + age + " " + number;
	}
}

public class T2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 a = new A1("Arpan", 22, 4545454545l);
		A1 a1 = new A1("Panigrahi", 23, 7894561237l);
		System.out.println(a.toString());
		System.out.println(a1.toString());
	}
}

