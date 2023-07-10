package com.jsp.GameApplication;

public class Thar implements Car
{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Manual Start");
		
	}

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		System.out.println("Clutch Drive");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Manual Stop");
		
	}
}