package com.jsp.strings;

public class Reverse_Each_Word_Of_Character 
{
	public static void main(String[] args) 
	{
		String str = "java is easy";
		String[] words = str.split(" ");
		String revString = "";
		
		for(int i = 0; i < words.length; i++)
		{
			String word = words[i];
			String revWord = "";
			
			for(int j = word.length()-1; j >= 0; j--)
			{
				revWord = revWord + word.charAt(j); //avaj
			}
			revString = revString + revWord + ""; // avaj si
			System.out.println(revString);
		}
		
	}
}

