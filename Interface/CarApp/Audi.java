package com.jsp.CarApp;

public class Audi  implements Car{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Button Start");
		
	}

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		System.out.println("Full Clutch Drive");
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Button Stop");	
	}
	
	public void bluetooth()
	{
		System.out.println("Boat bluetooth for Audi Car");
	}
}
