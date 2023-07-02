package com.jsp.packoverriding;

class Phone
{
	String name;
	String color;
	double price;
	int ram;
	
	Phone(String name, String color, double price, int ram)
	{
		this.name = name;
		this.color = color;
		this.price = price;
		this.ram = ram;
	}
	public void display()
	{
		System.out.println("Name: " + name);
		System.out.println("Color: " + color);
		System.out.println("Price: " + price);
		System.out.println("Ram: " + ram);
	}
}

class CameraPhone extends Phone
{
//	String name;
//	String color;
//	double price;
	int pixel;
	
	CameraPhone(String name, String color, double price, int ram, int pixel)
	{
//		this.name = name;
//		this.color = color;
//		this.price = price;
//		this.ram = ram;
		super(name, color, price, ram);
		this.pixel = pixel;
	}
	
	@Override
	public void display()
	{
//		System.out.println("Name: " + name);
//		System.out.println("Color: " + color);
//		System.out.println("Price: " + price);
//		System.out.println("Ram: " + ram);
		super.display();
		System.out.println("Pixel: " + pixel);
	}
}
public class T3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone phone = new Phone("Motorla","Silver",23000,8);
		phone.display();
		
		System.out.println("***********************");
		
		CameraPhone cameraPhone = new CameraPhone("Samsung","Gray",32000,16,40);
		cameraPhone.display();

	}

}
