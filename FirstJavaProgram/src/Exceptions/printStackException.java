package Exceptions;

public class printStackException {
	/*
Problem Description
How to print stack of the Exception?

Solution
This example shows how to print stack of the exception using printStack() method of the exception class.
	 */
	public static void main (String args[]) {
		int array[] = {20,20,40};
		int num1 = 15, num2 = 10;
		int result = 10;
		try {
			result = num1/num2;
			System.out.println("The result is" +result);

			for(int i = 5; i >= 0; i--) {
				System.out.println("The value of array is" +array[i]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
