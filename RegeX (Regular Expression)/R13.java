package com.jsp.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class R13 {
	public static void main(String[] args) {
		String s = "a2baaAdc3fjfa2or";
		String exp = "[a-zA-Z][^ab]";
		
		Pattern p = Pattern.compile(exp);
		Matcher m = p.matcher(s);
		
		while(m.find())
		{
			System.out.println(m.group());
		}
	}
}
