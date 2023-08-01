package com.jsp.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email_Validation {
	public static void main(String[] args) {
		String s = "arpanpanigrahi09@gmail.com";
		String exp = "[a-z][a-zA-Z0-9]+@[a-zA-Z]+[.]com";
		
		Pattern p = Pattern.compile(exp);
		Matcher m = p.matcher(s);
		
		if(m.matches())
			System.out.println("Valid");
		else
			System.out.println("Not Valid");		
	}
}
