package com.jsp.java8interface;

public class BMW implements Car
{
	@Override
	public void start()
	{
		System.out.println("Touch start");
	}
	
	@Override
	public void accelarate()
	{
		System.out.println("Drive Mode");
	}
	
	@Override
	public void stop()
	{
		System.out.println("Touch stop");
	}
	
}
