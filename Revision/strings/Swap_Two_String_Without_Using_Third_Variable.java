package com.jsp.strings;

public class Swap_Two_String_Without_Using_Third_Variable {
	public static void main(String[] args) {
		String a = "Jspider";
		String b = "Pyspider";
		a =a + b;
		b = a.substring(0,a.length()-b.length());
		a = a.substring(b.length());
		System.out.println(a+" "+b);	
	}
}


//public class Swap_Two_String_Without_Using_Third_Variable {
//    public static void main(String[] args) {
//        String str1 = "Hello";
//        String str2 = "World";
//
//        System.out.println("Before Swap:");
//        System.out.println("str1 = " + str1);
//        System.out.println("str2 = " + str2);
//
//        str1 = str1.concat(str2); // Concatenate str1 and str2
//        str2 = str1.substring(0, str1.length() - str2.length()); // Extract the original str1
//        str1 = str1.substring(str2.length()); // Extract the original str2
//
//        System.out.println("\nAfter Swap:");
//        System.out.println("str1 = " + str1);
//        System.out.println("str2 = " + str2);
//    }
//}
