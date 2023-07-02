package com.jsp.constructorpack;

class C
{
	static int count;
	
	C()
	{
		count++;
	}
}

public class T4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new C();
		new C();
		new C();
		
		System.out.println("The count of objects is:" +C.count);

	}

}
