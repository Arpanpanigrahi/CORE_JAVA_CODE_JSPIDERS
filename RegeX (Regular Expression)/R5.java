package com.jsp.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class R5 {
	public static void main(String[] args) {
		System.out.println("java\"is\"java");
		String s = "ababbabbaaba";
		String exp = "a.b";
		
		Pattern p = Pattern.compile(exp);
		Matcher m = p.matcher(s);
		
		while(m.find())
		{
			System.out.println(m.group());
		}
	}
}
