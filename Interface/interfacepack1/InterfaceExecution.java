package com.jsp.interfacepack1;

interface Switch
{
	void on();
	void off();
}

class Fan implements Switch
{
	@Override
	public void on()
	{
		System.out.println("Fan is on");
	}
	@Override
	public void off()
	{
		System.out.println("Fan is off");
	}
}

class Bulb implements Switch
{
	@Override
	public void on()
	{
		System.out.println("Bulb is on");
	}
	@Override
	public void off()
	{
		System.out.println("Bulb is off");
	}
}

class AC implements Switch
{
	@Override
	public void on()
	{
		System.out.println("AC is on");
	}
	@Override
	public void off()
	{
		System.out.println("AC is off");
	}
}

class Person
{
	public static void useDevice(Switch s)
	{
		s.on();
		s.off();
	}
}
public class InterfaceExecution {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person.useDevice(new Bulb());
		Person.useDevice(new Fan());
		Person.useDevice(new AC());
	}
}
