package com.jsp.GameApplication;

public class Alto implements Car
{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Key Start");
		
	}

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		System.out.println("Half Clutch Drive");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Key Stop");
		
	}
	
	public void gps()
	{
		System.out.println("gps installed for " +this.getClass().getSimpleName() + "Car");
	}
	
}
