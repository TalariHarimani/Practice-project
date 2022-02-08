package com.assignment;


public class Methods {
        
       int multiOeratin(int a,int b)
       {
    	  int c=a*b;
    	  System.out.println("multiopratin of c is "+c);
    	  return c;
       }
       static void findEvenOdd(int n) {
	    	if(n%2==0)
	    	{
	    		System.out.println("given number is even");
	    	}
	    	else
	    	{
	    		System.out.println("given number is odd");
	    	}
       }

	public static void main(String[] args) {
		Methods m=new Methods();
		m.multiOeratin(4, 9);
		findEvenOdd(9);
   }
}
