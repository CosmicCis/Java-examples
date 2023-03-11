package Exceptions;

public class printStackException2 {
	/*
Problem Description
How to print stack of the Exception?

Solution
This example shows how to print stack of the exception using printStack() method of the exception class.
	 */
	public static void main(String[] args) {
		try {
			ExceptionFunc();
		} catch(Throwable e) {
			e.printStackTrace();
		}
	}
	public static void ExceptionFunc() throws Throwable {
		Throwable t = new Throwable("This is new Exception in Java...");

		StackTraceElement[] trace = new StackTraceElement[] {
				new StackTraceElement("ClassName","methodName","fileName",5)
		};
		t.setStackTrace(trace);
		throw t;
	}
}
