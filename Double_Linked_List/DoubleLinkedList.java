//package com.jsp.doublelinkedlistimp1;
//
//public class DoubleLinkedList {
//	private Node first = null;
//	private int count = 0;
//	
//	public void add(Object e)
//	{
//		if(first==null)
//		{
//			first = new Node(e);
//			count++;
//			return;
//		}
//		
//		Node curr = first;
//		while(curr.next!=null)
//			curr = curr.next;
//	}
//	
//	public int size()
//	{
//		return count;
//	}
//	
//	public Object get(int index)
//	{
//		if(index<=-1 || index>=size())
//		{
//			throw new IndexOutOfBoundsException();
//		}
//		
//		Node curr = first;
//		for(int i=1; i<=index; i++)
//		{
//			curr = curr.next;
//		}
//		
//		return curr.ele;
//	}
//	
//	public void add(int index, Object e)
//	{
//		if(index<=-1 || index>=size())
//		{
//			throw new IndexOutOfBoundsException();
//		}
//		
//		if(index==0)
//		{
//			Node n = new Node(e, first, null);
//				first.prev = n;
//				first = n;
//				count++;
//				return;
//		}
//		
//		Node curr = first;
//		for(int i=1; i<index; i++)
//		{
//			curr = curr.next;
//		}
//		
//		Node n = new Node(e, curr.next, curr);
//		{
//			curr.next = n;
//			n.next.prev = n;
//			count++;
//		}
//		
//		public void remove(int index)
//		{
//			if(index<=-1 || index>=size())
//			{
//				throw new IndexOutOfBoundsException();
//			}
//			
//			if(index==0)
//			{
//				//Node n = new Node(e, first, null);
//					first = first.next;
//					first.prev = null;
//					count--;
//					return;
//			}
//			
//			Node curr = first;
//			for(int i=1; i<index; i++)
//			{
//				curr = curr.next;
//			}
//			
//			curr.next = curr.next.next;
//			if(curr.next!=null)
//				curr.next.prev = curr;
//			count--;
//		}
//	}
//}

package com.jsp.doublelinkedlistimp1;

public class DoubleLinkedList {
    private Node first = null;
    private int count = 0;

    public void add(Object e) {
        if (first == null) {
            first = new Node(e);
        } else {
            Node curr = first;
            while (curr.next != null) {
                curr = curr.next;
            }
            Node newNode = new Node(e);
            curr.next = newNode;
            newNode.prev = curr;
        }
        count++;
    }

    public int size() {
        return count;
    }

    public Object get(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }

        Node curr = first;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }

        return curr.ele;
    }

    public void add(int index, Object e) {
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            Node newNode = new Node(e);
            newNode.next = first;
            if (first != null) {
                first.prev = newNode;
            }
            first = newNode;
        } else {
            Node curr = first;
            for (int i = 0; i < index - 1; i++) {
                curr = curr.next;
            }
            Node newNode = new Node(e);
            newNode.prev = curr;
            newNode.next = curr.next;
            if (curr.next != null) {
                curr.next.prev = newNode;
            }
            curr.next = newNode;
        }
        count++;
    }

    public void remove(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            first = first.next;
            if (first != null) {
                first.prev = null;
            }
        } else {
            Node curr = first;
            for (int i = 0; i < index - 1; i++) {
                curr = curr.next;
            }
            curr.next = curr.next.next;
            if (curr.next != null) {
                curr.next.prev = curr;
            }
        }
        count--;
    }

    private static class Node {
        Object ele;
        Node prev;
        Node next;

        Node(Object ele) {
            this.ele = ele;
        }

        Node(Object ele, Node next, Node prev) {
            this.ele = ele;
            this.next = next;
            this.prev = prev;
        }
    }
}
