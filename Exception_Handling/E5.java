package com.jsp.exceptioncode;

public class E5 {
	public static void main(String[] args) {
		String s = null;
		try
		{
			System.out.println(s.toString());
			System.out.println(s.length()); //NullPointerException
		}
		catch(NullPointerException e)
		{
			s = "JSP";
			System.out.println(s.toString());
			System.out.println(s.length());
		}
	}
}
