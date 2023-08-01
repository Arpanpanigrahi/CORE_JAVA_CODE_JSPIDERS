package com.jsp.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class R20 {
	public static void main(String[] args) {
		String s = "abcabbbbcaccbbbaac";
		String exp = "[ab]+";
		
		Pattern p = Pattern.compile(exp);
		Matcher m = p.matcher(s);
		
		while(m.find())
		{
			System.out.println(m.group());
		}
	}
}
