package com.assignment;

import java.util.Scanner;

public class EmailValidation {

	public static void main(String[] args) {

		String n;
		String array[]= {"harimani457@gmail.com","xyz98@gmail.com"};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your valid Email:");
		n=sc.next();
		if(array[0].equals(n)){
			System.out.println("User Authenticated");	
		}
		else if(array[1].equals(n))
		{
			System.out.println("User Authenticated");
		}
		else
		{
			System.out.println("User is not Authenticated");
		}

	}

}
