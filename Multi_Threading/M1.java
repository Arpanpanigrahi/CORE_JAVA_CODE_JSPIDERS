package com.jsp.code;

class T1 extends Thread
{
	public void run()
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println(i + " T1 Thread");
		}
	}
}

public class M1 
{
	public static void main(String[] args) 
	{
		T1 t1 = new T1();
		t1.start(); //new Thread is started
		for(int i=65; i<=75; i++)
		{
			System.out.println((char) i +" main Thread");
		}
	}
}
