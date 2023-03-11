package Exceptions;

public class handleMultipleExceptions2 {
	/*
Problem Description
How to use handle multiple exceptions (devided by zero)?

Solution
This example shows how to handle multiple exceptions while deviding by zero ?
	 */
	public static void main(String args[]) {
		int[] a = new int[0];
		try {
			a = new int[5];
			a[5] = 30 / 0;
			System.out.println(a[5]); // Accessing an index outside the array bounds
			System.out.println(30 / 0); // Dividing by zero


		} catch (ArithmeticException e) {
			System.out.println("task1 is completed");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("task2 completed");
		} catch (Exception e) {
			System.out.println("common task completed");
		}
		System.out.println(a); // Accessing an index outside the array bounds
		System.out.println(30 / 0); // Dividing by zero
		System.out.println("rest of the code...");
	}
}