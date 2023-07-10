package com.jsp.interfacepack1;

interface Sim
{
	void connectCall();
}

class Airtel implements Sim
{
	@Override
	public void connectCall()
	{
		System.out.println("AIRTEL INDIA LIMITED");
	}
}

class Jio implements Sim
{
	@Override
	public void connectCall()
	{
		System.out.println("JIO INDIA LIMITED");
	}
}

class Vp implements Sim
{
	@Override
	public void connectCall()
	{
		System.out.println("VODAPHONE INDIA LIMITED");
	}
}

class Phone
{
	public static void useDevice(Sim s)
	{
		s.connectCall();
	}
}
public class InterfaceExecution1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone.useDevice(new Airtel());
		Phone.useDevice(new Jio());
		Phone.useDevice(new Vp());
	}
}

