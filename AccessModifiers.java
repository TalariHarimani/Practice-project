package com.assignment;


public class AccessModifiers {
	public void  display()
	{
		System.out.println("public class");
	}
	protected void value()
	{
		System.out.println("protected class");
	}
	 void run() {
		 System.out.println("default class");
	 }
	 private  void desk()
		{
			System.out.println("private class");
		}

	public static void main(String[] args) {
		AccessModifiers am=new AccessModifiers();
		am.display();
		am.value();
		am.run();
		am.desk();

	}

}
