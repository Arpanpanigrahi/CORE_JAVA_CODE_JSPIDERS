package com.jsp.code;

class MyThread extends Thread
{
	String s;
	public MyThread(String s)
	{
		this.s = s;
	}
	@Override
	public void run()
	{
		System.out.println("Child Thread" +s);
	}
}

public class M3 
{
	public static void main(String[] args)
	{
		MyThread t1 = new MyThread("T1");
		MyThread t2 = new MyThread("T2");
		System.out.println(t1.getPriority()+ " " +t2.getPriority());
		System.out.println(t1.getName()+ " " +t2.getName());
		t1.start();
		t2.start();
	}
}
