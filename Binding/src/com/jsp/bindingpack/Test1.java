package com.jsp.bindingpack;

class Mechanic1
{
	void service(Bike b)
	{
		System.out.println("M1 BIKE");
	}
	
	void service(Pulsar p)
	{
		System.out.println("M1 PULSAR");
	}
}

class Mechanic2 extends Mechanic1
{
	void service(Bike b)
	{
		System.out.println("M2 BIKE");
	}
	
	void service(Pulsar p)
	{
		System.out.println("M2 PULSAR");
	}
}

class Bike
{
	
}

class Pulsar
{
	
}
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pulsar bike = new Pulsar();
		Mechanic1 mech = new Mechanic2();
		mech.service(bike);
	}
}
