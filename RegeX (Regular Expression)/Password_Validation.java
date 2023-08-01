package com.jsp.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password_Validation {
	public static void main(String[] args) {
		String s = "Ram@123";
		String exp = "(?=.*[0-9])(?=.*[a-z])(?=.[A-Z])(?=.*[!@#$%^&*]).{6}";
		
		Pattern p = Pattern.compile(exp);
		Matcher m = p.matcher(s);
		
		if(m.matches())
			System.out.println("Valid");
		else
			System.out.println("Not Valid");		
	}
}
