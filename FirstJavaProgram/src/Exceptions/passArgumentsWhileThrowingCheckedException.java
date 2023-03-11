package Exceptions;

public class passArgumentsWhileThrowingCheckedException {
	/*
Problem Description
How to pass arguments while throwing checked exception?

Solution
This example shows how to pass arguments while throwing an exception & how to use these arguments while catching an exception using getMessage() method of Exception class.
	 */
	public static void main (String args[]) {
		try {
			throw new Exception("throwing an exception");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
