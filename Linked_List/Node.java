package com.jsp.listimp1;

public class Node 
{
	Object ele;
	Node next;
	
	Node(Object e)
	{
		ele = e;
		next = null;
	}
	
	Node(Object e, Node n)
	{
		ele = e;
		next = n;
	}
}
