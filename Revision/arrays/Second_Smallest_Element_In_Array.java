package com.jsp.arrays;

public class Second_Smallest_Element_In_Array {
	public static void main(String[] args) {
		int a[] = {11, 3, 4, 5, 6, 7, 8};
		int min1 = a[0];
		int min2 = a[0];
		
		for (int i = 0; i < a.length; i++) {
            if (a[i] < min1) {
                min2 = min1;
                min1 = a[i];
            } 
            else if (a[i] < min2 && a[i] != min1) {
                min2 = a[i];
            }
        }
		System.out.println(min2);
	}
}


