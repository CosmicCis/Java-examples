package Exceptions;

public class handleCheckedException {
	/*
Problem Description
How to handle checked exception?

Solution
This example shows how to handle checked exception using catch block.
	 */
	public static void main (String args[]) {
		try {
			throw new Exception("throwing an exception");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
