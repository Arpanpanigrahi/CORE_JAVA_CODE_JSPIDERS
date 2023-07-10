package com.jsp.GameApplication;

public class Skoda implements Car
{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Button Start");
		
	}

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		System.out.println("Automatic Drive");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Button Stop");
		
	}
	
	public void gps()
	{
		System.out.println("gps installed for " +this.getClass().getSimpleName() + "Car");
	}
	
	public void musicPlayer()
	{
		System.out.println("music player for Skoda");
	}
	
}

