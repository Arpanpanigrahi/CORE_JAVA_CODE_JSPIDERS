package com.jsp.arrayprgs;

import java.util.Arrays;
class Circle implements Comparable
{
	int radius;
	Circle(int r)
	{
		radius = r;
	}
	
	public int compareTo(Object o)
	{
		return radius - ((Circle)o).radius;
	}
	
	public String toString()
	{
		return "Circle[radius=" +radius+"]";
	}
}

public class Test5 
{
	public static void main(String[] args) 
	{
		Circle[] arr = {
				new Circle(40),
				new Circle(20),
				new Circle(10),
				new Circle(60),
				new Circle(30),
				new Circle(50),
		};
		
		Arrays.sort(arr);
		
		for(Circle c:arr)
		{
			System.out.println(c);
		}
	}
}


	