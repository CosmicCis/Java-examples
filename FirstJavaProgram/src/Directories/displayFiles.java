package Directories;

import java.io.File;

public class displayFiles {
	/*
Problem Description
How to display all the files in a directory?

Solution
Following example shows how to display all the files contained in a directory using list method of File class.
	 */
	public static void main(String[] args) {
		File dir = new File("C:");
		String[] children = dir.list();

		if (children == null) {
			System.out.println( "Either dir does not exist or is not a directory");
		} else {
			for (int i = 0; i< children.length; i++) {
				String filename = children[i];
				System.out.println(filename);
			}
		}
	}
}
