package Directories;

public class findCurrentWorkingDirectory {
	/*
Problem Description
How to find current working directory?

Solution
Following example shows how to get current directory using getProperty() method.
	 */
	public static void main(String[] args) {
		String curDir = System.getProperty("user.dir");
		System.out.println("You currently working in :" + curDir+ ": Directory");
	}
}
