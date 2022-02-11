package com.assignment;

import java.util.EmptyStackException;

public class MyStack {
	private Node first=null;
	private int count=0;
	public void push(Object e)
	{
		if(first==null)
		{
			first=new Node(e,null);
			count++;
			return;
		}
		first=new Node(e,first);
		count++;
	}
	public Object peek()
	{
		if(first==null) throw new EmptyStackException();
		return first.ele;
	}
	public Object pop()
	{
		if(first==null) throw new EmptyStackException();
		Object e=first.ele;
		first=first.next;
		count--;
		return e;
	}
	public int size()
	{
		return count;
	}
	class Node
	{
		Object ele;
		Node next;
		Node(Object e,Node n)
		{
			ele=e;
			next=n;
		}
	}
	

    	public static void main(String args[])
{
    		MyStack s=new MyStack();
    		s.push(10);
    		s.push(20);
    		s.push(30);
    		s.push(40);
    		System.out.println("Last element in the stack is "+s.peek());
    		s.pop();
    		System.out.println("The size of Stack is "+s.size());
      }

}
