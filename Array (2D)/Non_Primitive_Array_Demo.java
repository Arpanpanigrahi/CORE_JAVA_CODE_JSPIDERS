package com.jsp.arrayprgs;

class A
{
	int i;
	A(int i)
	{
		this.i=i;
	}
	void m1()
	{
		System.out.println(this.i);
	}
}
public class Non_Primitive_Array_Demo {
	public static void main(String[] args) {
		A[] arr = new A[3];
		arr[0] = new A(10);
		arr[1] = new A(20);
		arr[2] = new A(30);
//		arr[0] = new A[10];
//		arr[1] = new A[20];
//		arr[2] = new A[30];
		for(A ref:arr)
		{
			ref.m1();
		}
		arr[0].m1();
	}

}
