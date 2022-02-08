package com.assignment;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeMap;


public class MyMap {

	public static void main(String[] args) {
			HashMap<Integer,String> hm=new HashMap<Integer,String>();
			hm.put(3,"one");
			hm.put(2, "two");
			hm.put(1, "three");
	     System.out.println("The elements of HashSet are");
	     System.out.println(hm);
	     
	     Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	      
	       ht.put(6,"java");  
	       ht.put(5,"html");  
	       ht.put(7,"css"); 
	       ht.put(4, "javascriptl");
         System.out.println("The elements of HashTable are"); 
	     System.out.println(ht);
	     
         TreeMap<Integer,String> tm=new TreeMap<Integer,String>();    
	       tm.put(9,"xyz");    
	       tm.put(10,"mno");    
	       tm.put(8,"abc");       
	      
	      System.out.println("The elements of TreeMap are");  
		     System.out.println(tm);
	      
        }

}
