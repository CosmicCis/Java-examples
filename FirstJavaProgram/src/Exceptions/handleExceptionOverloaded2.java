package Exceptions;
class NewClass1 {
	void msg() throws Exception {
		System.out.println("this is parent");
	}
}
public class handleExceptionOverloaded2 extends NewClass1 {
	/*
Problem Description
How to handle the exception with overloaded methods?

Solution
This example shows how to handle the exception with overloaded methods. You need to have a try catch block in each method or where the are used.
	 */
	handleExceptionOverloaded2(){}
	void msg() throws ArithmeticException {
		System.out.println("This is child");
	}

	public static void main(String[] args) {
		NewClass1 n = new handleExceptionOverloaded2();
		try {
			n.msg();
		} catch (Exception e) {
		}
	}
}