package com.jsp.arrays;

import java.util.Arrays;

/*
 * Input --> {1, 2, 3, 4, 5}
 * Output --> {5, 1, 2, 3. 4}
 */
public class Cyclically_Rotate_One_In_Array {
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5};
		rotateArray(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void rotateArray(int arr[]) 
	{
		int lastElem = arr[arr.length - 1];
		
		for(int i=arr.length-1; i>0; i--)
		{
			arr[i] = arr[i-1]; //[1, 1, 2, 3, 4]
		}
		arr[0] = lastElem; //[5, 1, 2, 3, 4]
	}
}
