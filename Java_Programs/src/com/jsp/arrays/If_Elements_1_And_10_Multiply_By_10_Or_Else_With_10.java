package com.jsp.arrays;
/*
 * In an array, if elements are 1 and 2 multiply with 10, if else  replace with 10.
 * Input --> {2, 3, 10, 1, 5, 7}
 * Output --> {20, 10, 10, 10, 10, 10}
 */
public class If_Elements_1_And_10_Multiply_By_10_Or_Else_With_10 {
	public static void main(String[] args) {
		int a[] = {2, 3, 10, 1, 5, 7};
		for(int i=0; i<a.length; i++)
		{
			if(a[i] == 1 || a[i] == 2)
			{
				a[i] *= 10;  //multiply 1 or 2 by 10
			}
			else
			{
				a[i] = 10;
			}
		}
		for(int num : a)
		{
			System.out.print(num +" ");
		}
	}
}
