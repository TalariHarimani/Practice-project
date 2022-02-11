package com.assignment;

public class MyQueue {
	private Node first=null;
    private int count=0;
    public void add(Object e)
    {
   	 if(first==null)
   	 {
   		 first=new Node(e,null);
   		 count++;
   		 return;
   	 }
   	 Node cur=first;
   	 while(cur.next!=null)
   	 {
   		 cur=cur.next;
   	 }
   	 cur.next=new Node(e,null);
   	 count++;
   	 }
    public int size()
    {
   	 return count;
    }
    public Object peek()
    {
   	 if(first==null) return null;
   	 return first.ele;
    }
    public Object poll()
    {
   	 if(first==null) return null;
   	 Object e=first.ele;
   	 first=first.next;
   	 count--;
   	 return e;
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

	public static void main(String[] args) {
		MyQueue q=new MyQueue();
		q.add(10);
		q.add(20);
	    q.add(30);
	    q.add(40);
	    System.out.println("first element in Queue is "+q.peek());
	    q.poll();
	    System.out.println("size of Queue is "+q.size());
	}

}

