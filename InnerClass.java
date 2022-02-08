package com.assignment;

public class InnerClass {
	int i;
	 InnerClass(int i) {
		this.i = i;
	}
 public  class A {
	 void m1() {
		 System.out.println(i);
	 }
 }

	public static void main(String[] args) {
		InnerClass ic=new InnerClass(10);
		InnerClass.A ia=ic.new A();
		ia.m1();
	}
}
		
				

	