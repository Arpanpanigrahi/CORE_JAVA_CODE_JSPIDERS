package com.jsp.overridingrules;

class Car
{
	
}

class Audi extends Car
{
	
}

class Benz extends Car
{
	
}

class Driver
{
	public void drive(Car c)
	{
		System.out.println("Driver executed");
	}
}
public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Audi a = new Audi();
		
		Driver d = new Driver();
		d.drive(a);
		
		d.drive(new Benz());
	}
}
