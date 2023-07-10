package com.jsp.java8interface;

public class Audi implements Car
{
	@Override
	public void start()
	{
		System.out.println("Button start");
	}
	
	@Override
	public void accelarate()
	{
		System.out.println("Full clutch drive");
	}
	
	@Override
	public void stop()
	{
		System.out.println("Button stop");
	}
	
}
