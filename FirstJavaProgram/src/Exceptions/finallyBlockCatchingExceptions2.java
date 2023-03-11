package Exceptions;

public class finallyBlockCatchingExceptions2 {
	/*
Problem Description
How to use finally block for catching exceptions?

Solution
This example shows how to use finally block to catch runtime exceptions (Illegal Argument Exception) by the use of e.getMessage().
	 */

	public static void main(String[] args) {
		try {
			int data = 25/5;
			System.out.println(data);
		} catch(NullPointerException e) {
			System.out.println(e);
		} finally {
			System.out.println("finally block is always executed");
		}
		System.out.println("rest of the code...");
	}
}
