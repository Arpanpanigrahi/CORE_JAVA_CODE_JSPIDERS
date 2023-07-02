package com.jsp.blocks;

class Car
{
	static int cNo;
	static
	{
		cNo = 1000;
	}
	
	//non-static blocks
	{
		cNo++;
	}
	int carNo;
	String carName;
	String color;
	
	Car(String carName)
	{
		this.carNo = cNo;
		this.carName = carName;
		color = "white";
	}
	
	Car(String carName, String color)
	{
		this.carNo = cNo;
		this.carName = carName;
		this.color = color;
	}
	
	public void carInfo()
	{
		System.out.println("Car No: KA 01 H" +carNo);
		System.out.println("Car Name: " +carName);
		System.out.println("Car Color: " +color);
	}
}

public class CarDevelopment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car("Alto");
		car1.carInfo();
		
		Car car2 = new Car("Brezza","navy blue");
		car2.carInfo();
		
		Car car3 = new Car("Baleno","Gray Black");
		car3.carInfo();
	}
}
