package com.jsp.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class R1 {
	public static void main(String[] args) {
		String s = "aabbcca";
		String exp = "a";
		
		Pattern p = Pattern.compile(exp);
		Matcher m = p.matcher(s);
		
		System.out.println(m.find());
		System.out.println(m.find());
		System.out.println(m.find());
		System.out.println(m.find());
	}
}
