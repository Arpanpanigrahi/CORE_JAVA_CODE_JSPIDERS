package com.jsp.java8interface;

public interface Car
{
	void start();
	void accelarate();
	void stop();
	
	default void gps()
	{
		//throw exception
	}
	
	static void CarGuide()
	{
		System.out.println("Wear Seat Bealts");
	}
}

