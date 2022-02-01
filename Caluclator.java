package com.assignment;

public class Caluclator {
	static int addition(int a,int b)
	{
		int result=a+b;
		System.out.println("the addition is="+result);
		return result;
	}
	static int subtraction(int a,int b)
	{
		int result=a-b;
		System.out.println("the subtraction is="+result);
		return result;
	}
	static int multiplication(int a,int b)
	{
		int result=a*b;
		System.out.println("the multiplication is="+result);
		return result;
	}
	static int division(int a,int b)
	{
		int result=a/b;
		System.out.println("the division is="+result);
		return result;
	}
	
	public static void main(String[] args) {
		int num1=30;
		int num2=5;
		addition(num1,num2);
		subtraction(num1,num2);
		multiplication(num1,num2);
		division(num1,num2);
	}

}
