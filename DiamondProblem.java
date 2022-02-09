package com.assignment;

interface A 
{  
    static void show() 
    { 
        System.out.println("First Default"); 
    } 
} 
interface B 
{  
     static void show() 
    { 
        System.out.println("Second Default"); 
    } 
}  
public class DiamondProblem implements A, B 
{  
    public void show() 
    {  
        A.show(); 
        B.show(); 
    } 
    public static void main(String args[]) 
    { 
    	DiamondProblem ob = new DiamondProblem(); 
        ob.show(); 
    } 
}
		

