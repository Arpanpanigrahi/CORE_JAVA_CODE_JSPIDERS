package com.jsp.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Min_Max {
	public static void main(String[] args) {
		String s = "abAbbbbabbAbaabbb";
		String exp = "Ab{2,5}";
		
		Pattern p = Pattern.compile(exp);
		Matcher m = p.matcher(s);
		
		while(m.find())
		{
			System.out.println(m.group());
		}
	}
}