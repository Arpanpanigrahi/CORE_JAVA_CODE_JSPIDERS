package com.jsp.listimp1;

public class Test2 
{
	public static void main(String[] args) 
	{
		Node first = null;
		first = new Node(10);
		first.next = new Node(20);
		first.next.next = new Node(30);
		first.next.next.next = new Node(40);
		
		Node curr = first;
		while(curr != null)
		{
			System.out.println(curr.ele);
			curr = curr.next;
		}	
	}
}
