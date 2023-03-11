package Exceptions;

public class catchHandleException2 {
	/*
Problem Description
How to use catch to handle the exception?

Solution
This example shows how to use catch to handle the exception.
	 */
	public static void main(String args[]) {
		try {
			int data = 50/0;
		} catch(ArithmeticException e){System.out.println(e);}
		System.out.println("rest of the code...");
	}
}
