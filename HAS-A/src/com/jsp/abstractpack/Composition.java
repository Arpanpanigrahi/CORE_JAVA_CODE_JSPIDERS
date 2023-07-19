package com.jsp.abstractpack;

class Engine
{
	String brand;
	int cc;
	
	public Engine(String brand, int cc)
	{
		this.brand = brand;
		this.cc = cc;
	}
	
	@Override
	public String toString()
	{
		return "Engine [brand = " + brand + ", cc = " + cc + "]";
	}
}

class Car
{
	Engine e;
	String carName;
	String color;
	double price;
	
	public Car(Engine e, String carName, String color, double price)
	{
		this.e = e;
		this.carName = carName;
		this.color = color;
		this.price = price;
	}
	
	@Override
	public String toString()
	{
		return "Car [e = " + e + ", carName = " + carName + ", price = " + price + "]";
	}
}
public class Composition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car(new Engine("RRR", 2000), "Ghost","Black",2000);
		System.out.println(c);
	}

}
