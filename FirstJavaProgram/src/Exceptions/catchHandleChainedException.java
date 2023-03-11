package Exceptions;

public class catchHandleChainedException {
	/*
Problem Description
How to use catch to handle chained exception?

Solution
This example shows how to handle chained exception using multiple catch blocks.
	 */
	public static void main (String args[])throws Exception {
		int n = 20, result = 0;
		try {
			result = n/0;
			System.out.println("The result is "+result);
		} catch(ArithmeticException ex) {
			System.out.println ("Arithmetic exception occoured: "+ex);
			try {
				throw new NumberFormatException();
			} catch(NumberFormatException ex1) {
				System.out.println ("Chained exception thrown manually : "+ex1);
			}
		}
	}
}
