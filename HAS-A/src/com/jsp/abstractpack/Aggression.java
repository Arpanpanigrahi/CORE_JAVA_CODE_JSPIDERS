package com.jsp.abstractpack;

class Engine1
{
	String brand;
	int cc;
	
	public Engine1(String brand, int cc)
	{
		this.brand = brand;
		this.cc = cc;
	}
	
	@Override
	public String toString()
	{
		return "Engine1 [brand = " + brand + ", cc = " + cc + "]";
	}
}

class Music {
	String name;
	String song;
	
	public Music(String name, String song) {
		super();
		this.name = name;
		this.song = song;
	}
	@Override
	public String toString()
	{
		return "Music [name = " + name + ", song = " + song + "]";
	}
}
class Car1
{
	//Engine e;
	Music m;
	String carName;
	String color;
	double price;
	
	public void insertMusic(Music m)
	{
		this.m = m;
	}
	
	public Car1(String carName, String color, double price)
	{
		//this.e = e;
		this.carName = carName;
		this.color = color;
		this.price = price;
	}
	
	@Override
	public String toString()
	{
		return "Car1 [carName = " + carName + ", color = " + color + ", price = " + price + "]";
	}
}
public class Aggression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car1 c = new Car1("BMW", "Blue", 2000000);
		c.insertMusic(new Music("JBL", "BabyDoll"));
		System.out.println(c);
		System.out.println(c.m);
		System.out.println("-------------------------");
		c.m.name = "Boat";
		System.out.println(c.m);
		
	}

}
