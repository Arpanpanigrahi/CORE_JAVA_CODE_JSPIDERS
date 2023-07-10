package com.jsp.CarApp;

import java.util.Scanner;

class Vegetable 
{
	public void washVeg()
	{
		System.out.println("wash it with luke water");
	}
}

class Carrot extends Vegetable
{
	public void prepareHalwa()
	{
		System.out.println("carrot halwa is delicious");
	}
}

class Potato extends Vegetable
{
	public void prepareFries()
	{
		System.out.println("French Fries with more oil is good for health");
	}
}

class ShopKeeper
{
	public Vegetable sell(String VegName)
	{
		if(VegName.equalsIgnoreCase("Carrot")) return new Carrot();
		if(VegName.equalsIgnoreCase("Potato")) return new Potato();
		System.out.println(VegName + "not available");
		return null;
	}
}

public class VegCasting
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Veg : ");
		String VegName = scan.nextLine();
		
		ShopKeeper shopkeeper = new ShopKeeper();
		Vegetable Veg = shopkeeper.sell(VegName);
		
		if(Veg instanceof Carrot)
		{
			System.out.print(Veg.getClass().getSimpleName() + " ");
			Veg.washVeg();
			((Carrot)Veg).prepareHalwa();
		}
		
		if(Veg instanceof Potato)
		{
			System.out.print(Veg.getClass().getSimpleName() + " ");
			Veg.washVeg();
			((Potato)Veg).prepareFries();
		}
	}
}
		
