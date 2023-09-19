package com.jsp.doublelinkedlistimp1;

public class Node 
{
	Object ele;
	Node next;
	Node prev;
	
	Node(Object e)
	{
		ele = e;
		next = null;
		prev = null;
	}
	
	Node(Object e, Node n, Node p)
	{
		ele = e;
		next = n;
		prev = p;
	}
}
