package com.jsp.listimp1;

public class LinkedList 
{
	private Node first = null;
	private int count = 0;
	
	public void add(Object e)
	{
		if(first==null)
		{
			first = new Node(e);
			count++;
			return;
		}
		Node curr = first;
		while(curr.next != null)
		{
			curr = curr.next;
		}
		curr.next = new Node(e);
		count++;
	}
	public int size()
	{
		return count;
	}
	public Object get(int index)
	{
		if(index<=-1 || index>=size())
		{
			throw new IndexOutOfBoundsException();
		}
		Node curr = first;
		for(int i=1; i<= index; i++)
		{
			curr = curr.next;
		}
		return curr.ele;
	}
}
