package com.jsp.MarkerInterface;

class WasherMan
{
	public void wash(Object obj)
	{
		if(obj instanceof Washable)
			System.out.println(obj.getClass().getSimpleName() + "is washed and clean");
		
		else
			System.out.println(obj.getClass().getSimpleName() + "Not washable type");
	}
}

interface Washable
{
	//MarkerInterface means empty interface
}

class Car implements Washable
{
	
}

class Truck implements Washable
{
	
}

class Bike implements Washable
{
	
}

class Tv
{
	
}

class Mobile
{
	
}

public class MarkerInterface 
{
	public static void main(String[] args) {
		WasherMan washerman = new WasherMan();
		washerman.wash(new Mobile());
	}

}
