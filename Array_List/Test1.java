package com.jsp.arraylistcode;

public class Test1 
{
	public static void main(String[] args) 
	{
		ArrayList a1 = new ArrayList();
		a1.add("java");
		a1.add("c");
		a1.add("python");
		a1.add(2,"c++");
		a1.remove(0);
		
		for(int i=0; i<a1.size(); i++)
		{
			String s = (String)a1.get(i);
			System.out.println(s);
		}
	}
}
