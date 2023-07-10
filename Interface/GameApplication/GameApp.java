package com.jsp.GameApplication;

public class GameApp 
{
	public static void main(String[] args) 
	{
		Car car = CarSelector.giveCarObject();
		car.start();
		car.accelerate();
		
		Skoda skoda = (Skoda)car;
		
		if(car instanceof Alto) ((Alto)car).gps();
		if(car instanceof Skoda) skoda.gps();
		if(car instanceof Skoda) skoda.musicPlayer();
		car.stop();	
	}
}
