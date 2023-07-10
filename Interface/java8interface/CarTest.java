package com.jsp.java8interface;

public class CarTest 
{
	public static void main(String[] args) 
	{
		Car car;
		System.out.println("ALTO");
		car = new Alto();
		car.start();
		car.accelarate();
		car.stop();
		car.gps();
		System.out.println("***********");
		
		System.out.println("AUDI");
		car = new Audi();
		car.start();
		car.accelarate();
		car.stop();
		System.out.println("*************");
		
		System.out.println("BENZ");
		car = new Benz();
		car.start();
		car.accelarate();
		car.stop();
		System.out.println("***************");
		
		System.out.println("BMW");
		car = new BMW();
		car.start();
		car.accelarate();
		car.stop();
		car.gps();
		System.out.println("***************");
		
		Car.CarGuide();	
	}
}
