package com.jsp.GameApplication;

import java.util.Scanner;

public class CarSelector 
{
	public static Car giveCarObject()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Select Car :\n");
		System.out.println("1. Alto\n"  +  "2. Skoda\n"  + "3. Thar");
		
		int choice = scan.nextInt();
		
		if(choice==1) return new Alto();
		if(choice==2) return new Skoda();
		if(choice==3) return new Thar();
		
		System.out.println("Car not Selected");
		return null;
	}

}
