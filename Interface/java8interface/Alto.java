package com.jsp.java8interface;

public class Alto implements Car
{
	@Override
	public void start()
	{
		System.out.println("Key start");
	}
	
	@Override
	public void accelarate()
	{
		System.out.println("Half clutch drive");
	}
	
	@Override
	public void stop()
	{
		System.out.println("Key stop");
	}
	
}
