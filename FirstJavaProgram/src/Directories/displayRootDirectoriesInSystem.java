package Directories;

import java.io.File;

public class displayRootDirectoriesInSystem {
	/*
Problem Description
How to display root directories in the system?

Solution
Following example shows how to find root directories in your system using listRoots() method of File class.
	 */
	public static void main(String[] args) {
		File[] roots = File.listRoots();
		System.out.println("Root directories in your system are:");

		for (int i = 0; i < roots.length; i++) {
			System.out.println(roots[i].toString());
		}
	}
}
