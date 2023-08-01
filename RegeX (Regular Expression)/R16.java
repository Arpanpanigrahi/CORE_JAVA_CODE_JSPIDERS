package com.jsp.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class R16 {
	public static void main(String[] args) {
		String s = "ababbabbbbbbbbaba";
		String exp = "ab{2}";
		
		Pattern p = Pattern.compile(exp);
		Matcher m = p.matcher(s);
		
		while(m.find())
		{
			System.out.println(m.group());
		}
	}
}
