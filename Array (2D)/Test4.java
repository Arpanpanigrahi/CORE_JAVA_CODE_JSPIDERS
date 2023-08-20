package com.jsp.arrayprgs;

interface Animal
{
	void makeSound();
}

class Dog implements Animal
{
	public void makeSound()
	{
		System.out.println("bow bow");
	}
	@Override
	public String toString()
	{
		return "i am a dog";
	}
}

class Cat implements Animal
{
	public void makeSound()
	{
		System.out.println("meow");
	}
	@Override
	public String toString()
	{
		return "i am a cat";
	}
}

public class Test4 
{
	public static void main(String[] args) {
		Animal[] arr = new Animal[4];
		arr[0] = new Dog();
		arr[1] = new Cat();
		arr[2] = new Dog();
		arr[3] = new Cat();
		
		for(Animal a:arr)
		{
			System.out.println(a);
			a.makeSound();
		}
	}
}
