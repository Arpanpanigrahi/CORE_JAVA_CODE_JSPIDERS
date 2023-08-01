package com.jsp.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Indian_Mobile_Validation {
	public static void main(String[] args) {
		String s = "9876543219";
		String exp = "[6-9][0-9]{9}";
		
		Pattern p = Pattern.compile(exp);
		Matcher m = p.matcher(s);
		
		if(m.matches())
			System.out.println("Valid");
		else
			System.out.println("Not Valid");		
	}
}
