package com.jsp.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class R23 {
	public static void main(String[] args) {
		String s = "a1a132b467a85b6";
		String exp = "a[0-9]{2,5}";
		
		Pattern p = Pattern.compile(exp);
		Matcher m = p.matcher(s);
		
		while(m.find())
		{
			System.out.println(m.group());
		}
	}
}