package com.jsp.constructorpack;

class Rectangle
{
	int length;
	int breadth;
	
	Rectangle(int length, int breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}
	
	Rectangle(Rectangle r)
	{
		this.length = r.length;
		this.breadth = r.breadth;
	}
	
	Rectangle(int length, Rectangle r)
	{
		this.length = length;
		this.breadth = r.breadth;
	}
	
	Rectangle(Rectangle r, int breadth)
	{
		this.length = r.length;
		this.breadth = breadth;
	}
	
	public void displayArea()
	{
		System.out.println("Length: "+length + "Breadth: "+breadth);
		
	}
	
	public void calcArea()
	{
		int area = length * breadth;
		System.out.println("Area is:"+area);
		System.out.println("**********************");
	}
}
public class RectangleCopy {
	public static void main(String[] args)
	{
		Rectangle r1 = new Rectangle(5,7);
		r1.displayArea();
		r1.calcArea();
		
		Rectangle r2 = new Rectangle(r1);
		r2.displayArea();
		r2.calcArea();
		
		Rectangle r3 = new Rectangle(12,r2);
		r3.displayArea();
		r3.calcArea();
		
		Rectangle r4 = new Rectangle(r3,8);
		r4.displayArea();
		r4.calcArea();
	}

}
