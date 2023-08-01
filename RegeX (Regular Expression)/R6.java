package com.jsp.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class R6 {
	public static void main(String[] args) {
		String s = "ab.ab.babb.aa.ba";
		String exp = "\\.";
		
		Pattern p = Pattern.compile(exp);
		Matcher m = p.matcher(s);
		
		while(m.find())
		{
			System.out.println(m.group());
		}
	}
}
