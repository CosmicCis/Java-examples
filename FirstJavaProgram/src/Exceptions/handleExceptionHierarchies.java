package Exceptions;
class Animal extends Exception {
}
class Mammel extends Animal {
}
public class handleExceptionHierarchies {
	/*
Problem Description
How to handle the exception hierarchies?

Here is the sample diagram of Exception Hierarchies
Solution
This example shows how to handle the exception hierarchies by extending Exception class ?
	 */


		public static void main(String[] args) {
			try {
				throw new Mammel();
			} catch (Mammel m) {
				System.err.println("It is mammel");
			}
		}

}
