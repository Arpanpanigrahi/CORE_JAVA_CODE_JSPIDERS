package com.jsp.doublelinkedlistimp1;

public class Test {
	public static void main(String[] args) {
	DoubleLinkedList dl = new DoubleLinkedList();
	dl.add(10);
	dl.add(20);
	dl.add(30);
	dl.add(40);
	dl.remove(0);
	
	for(int i=0; i<dl.size(); i++)
	{
		System.out.println(dl.get(i));
	}
}

}
