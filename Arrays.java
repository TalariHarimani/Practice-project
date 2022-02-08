package com.assignment;

public class Arrays {

	public static void main(String[] args) {
		System.out.println("Single dimensional Array");
		 int[] a1=new int[5];
	       for(int i=1;i<=a1.length;i++)
	       {
	    	   System.out.print(i+" ");
	       }
	     System.out.println();
	     System.out.println("Multidimentional Array");  
		int[][] a2= {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<a2.length;i++)
		{
			for(int j=0;j<a2[i].length;j++)
			{
				System.out.print(a2[i][j]+" ");
			}
			System.out.println();
		}
	}

}
