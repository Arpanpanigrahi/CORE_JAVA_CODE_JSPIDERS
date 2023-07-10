package com.jsp.java8interface;

public class Benz implements Car
{
	@Override
	public void start()
	{
		System.out.println("Touch start");
	}
	
	@Override
	public void accelarate()
	{
		System.out.println("Automatic drive");
	}
	
	@Override
	public void stop()
	{
		System.out.println("Touch stop");
	}
	
}
