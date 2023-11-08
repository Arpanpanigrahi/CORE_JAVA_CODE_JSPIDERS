package com.jsp.searching;

public class Binary_Search {
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7,8,9};
		System.out.println(search(a,80));
	}
	
	public static int search(int a[], int key)
	{
		int start=0;
		int end=a.length-1;
		while(start<=end)
		{
			int mid=((start+end)/2);
			if(key==a[mid])
				return mid;
			else if(key<a[mid])
				end=mid-1;
			else
				start=mid+1;
		}
		return -1;
	}
}
