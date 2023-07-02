package com.jsp.thispack;

class Rectangle
{
	int length;
	int breadth;
	
	Rectangle(int length, int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	
	Rectangle(int data)
	{
		this(data, data);
	}
	
	public void displayArea()
	{
		System.out.println("Length: "+length + "Breadth: "+breadth);
	}
}
public class RectangleClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle(5,7);
		r1.displayArea();
		
		Rectangle r2 = new Rectangle(6);
		r2.displayArea();
	}
}
