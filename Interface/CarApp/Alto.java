package com.jsp.CarApp;

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
	
	public void bluetooth()
	{
		System.out.println("JBL Bluetooth for Alto Car");
	}
	
	public void airBag()
	{
		System.out.println("airbag installed for Alto");
	}
}
