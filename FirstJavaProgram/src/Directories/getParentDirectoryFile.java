package Directories;

import java.io.File;

public class getParentDirectoryFile {
	/*
Problem Description
How to get the parent directory of a file?

Solution
Following example shows how to get the parent directory of a file by the use of file.getParent() method of File class.
	 */
	public static void main(String[] args) {
		File file = new File("C:/File/demo.txt");
		String strParentDirectory = file.getParent();
		System.out.println("Parent directory is : " + strParentDirectory);
	}
}
