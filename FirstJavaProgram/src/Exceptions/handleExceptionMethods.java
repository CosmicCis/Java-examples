package Exceptions;

public class handleExceptionMethods {
	/*
Problem Description
How to handle the exception methods?

Solution
This example shows how to handle the exception methods by using System.err.println() method of System class.
	 */
	public static void main(String[] args) {
		try {
			throw new Exception("My Exception");
		} catch (Exception e) {
			System.err.println("Caught Exception");
			System.err.println("getMessage():" + e.getMessage());
			System.err.println("getLocalizedMessage():" + e.getLocalizedMessage());
			System.err.println("toString():" + e);
			System.err.println("printStackTrace():");
			e.printStackTrace();
		}
	}
}
