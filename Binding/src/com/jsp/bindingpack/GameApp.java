package com.jsp.bindingpack;

class Animal
{
	void sound()
	{
		
	}
	
	void movement()
	{
		
	}
}

class Dog extends Animal
{
	@Override
	void sound()
	{
		System.out.println("Bow Bow");
	}
	
	@Override
	void movement()
	{
		System.out.println("walks / runs / jumps");
	}
}

class Snake extends Animal
{
	@Override
	void sound()
	{
		System.out.println("Hsssssssssshhhhhh");
	}
	void movement()
	{
		System.out.println("Nagin Dance");
	}
}

public class GameApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal;
		animal = new Dog();
		animal.sound();
		animal.movement();
		
		animal = new Snake();
		animal.sound();
		animal.movement();
	}
}
