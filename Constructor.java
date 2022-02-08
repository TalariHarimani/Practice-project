package com.assignment;

public class Constructor {
	
	Constructor()
	{
        System.out.println("default constructor");
		
	}

	 Constructor(int id,String name)
	{
	
		System.out.println("parameterised constructor");
		System.out.println("id="+id+", name="+name);
	}

	public static void main(String[] args) {

			
	      Constructor c1=new Constructor();
	      Constructor c2=new Constructor(2,"mani");
	      
	      

	}

}
