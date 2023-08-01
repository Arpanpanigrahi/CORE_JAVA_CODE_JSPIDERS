package com.jsp.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class R12 {
	public static void main(String[] args) {
		String s = "a1bc3n4j9k54k4";
		String exp = "a[0-9][a-z]";
		
		Pattern p = Pattern.compile(exp);
		Matcher m = p.matcher(s);
		
		while(m.find())
		{
			System.out.println(m.group());
		}
	}
}
