package com.jsp.CarApp;

public class CarMain 
{
	public static void main(String[] args) 
	{
		Driver driver1 = new Driver();
		driver1.drive(new Alto());
		driver1.accessBluetooth(new Audi());
		driver1.accessBluetooth(new Alto());
		
		driver1.accessAirBag(new Alto());
	}
}
