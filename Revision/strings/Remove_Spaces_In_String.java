package com.jsp.strings;
/*
 * INTERVIEW
 */
public class Remove_Spaces_In_String {
	public static void main(String[] args) {
		String s = "java is easy";
		String s2 = " ";
		
		for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ' ') {
                s2 += c;
            }
        }
        System.out.println(s2);
    }
}