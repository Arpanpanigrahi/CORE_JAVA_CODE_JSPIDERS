package com.jsp.arrays;

public class Second_Highest_Element_In_Array {
	public static void main(String[] args) {
		int a[] = {11, 3, 4, 5, 6, 7, 8};
		int max1 = 0;
		int max2 = 0;
		
		for (int i = 0; i < a.length; i++) {
            if (a[i] > max1) {
                max2 = max1;
                max1 = a[i];
            } 
            else if (a[i] > max2 && a[i] != max1) {
                max2 = a[i];
            }
        }
		System.out.println(max2);
	}
}


