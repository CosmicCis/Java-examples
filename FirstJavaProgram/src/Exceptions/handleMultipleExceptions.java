package Exceptions;

public class handleMultipleExceptions {
	/*
Problem Description
How to use handle multiple exceptions (devided by zero)?

Solution
This example shows how to handle multiple exceptions while deviding by zero ?
	 */
	public static void main (String args[]) {
		int array[] = {20,20,40};
		int num1 = 15, num2 = 0;
		int result = 0;
		try {
			result = num1/num2;
			System.out.println("The result is" +result);

			for(int i = 2; i >= 0; i--) {
				System.out.println("The value of array is" +array[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error. Array is out of Bounds"+e);
		} catch (ArithmeticException e) {
			System.out.println ("Can't be divided by Zero"+e);
		}
	}
}
