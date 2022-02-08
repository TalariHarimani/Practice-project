package com.assignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Stack;
import java.util.TreeSet;

public class Collections {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(20);
		list.add(40);		
		list.add(30);		
		list.add(10);	
		System.out.println("The arraylist elements are");
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        LinkedList<Integer> ll=new LinkedList<Integer>();
        ll.add(25);
		ll.add(47);		
		ll.add(15);		
		ll.add(70);		
		System.out.println("The linkedlist elements are");
        System.out.println(ll);
        ll.remove(3);
        System.out.println(ll);
        ll.clear();
        System.out.println(ll);
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(2);
		hs.add(66);
		hs.add(48);
		System.out.println("The Hashset elements are");
		System.out.println(hs);
		System.out.println(hs.contains(48));
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(67);
		ts.add(23);
		ts.add(76);
		System.out.println("The Treeset elements are");
        System.out.println(ts);
	}

}
