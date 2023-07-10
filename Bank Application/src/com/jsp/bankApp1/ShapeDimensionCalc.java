package com.jsp.bankApp1;

abstract class Shape
{
		final double PI;
		{
			PI = 3.14;
		}
		String color;
		Shape(String color)
		{
			this.color = color;
		}
		
		abstract public void getArea();
		abstract public void calcArea();
}

class Circle extends Shape
{
	int radius;
	Circle(String color, int radius)
	{
		super(color);
		this.radius = radius;
	}
	
	@Override
	public void getArea()
	{
		System.out.println("Color :" +color);
		System.out.println("Radius :" +radius);
	}
	
	@Override
	public void calcArea()
	{
		double area = PI * radius * radius;
		System.out.println("Area is:" +area);
		System.out.println("******************");
	}
}

class Rectangle extends Shape
{
	int length;
	int breadth;
	
	Rectangle(String color, int length, int breadth)
	{
		super(color);
		this.length = length;
		this.breadth = breadth;
	}
	
	@Override
	public void getArea()
	{
		System.out.println("Color :" +color);
		System.out.println("Length :" +length);
		System.out.println("Breadth " +breadth);
	}
	
	@Override
	public void calcArea()
	{
		int area = length * breadth;
		System.out.println("Area :" +area);
	}
}

public class ShapeDimensionCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s = new Circle("Blue",6);
		s.getArea();
		s.calcArea();
		
		s = new Rectangle("Grey", 5, 6);
		s.getArea();
		s.calcArea();
	}
}
