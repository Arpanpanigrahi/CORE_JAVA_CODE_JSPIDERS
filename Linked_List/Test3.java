package com.jsp.listimp1;

public class Test3 
{
	public static void main(String[] args) 
	{
		LinkedList l = new LinkedList();
		l.add(50);
		l.add(60);
		l.add(70);
		l.add(80);
		
		for(int i=0; i<l.size(); i++)
		{
			System.out.println(l.get(i));
		}
	}
}
