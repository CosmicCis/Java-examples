package Directories;

import java.io.File;

public class displayFiles2 {
	/*
Problem Description
How to display all the files in a directory?

Solution
Following example shows how to display all the files contained in a directory using list method of File class.
	 */
	public static File folder = new File("C:\\Microsoft1");
	static String temp = "";

	public static void main(String[] args) {
		System.out.println("Reading files under the folder "+ folder.getAbsolutePath());
		listFilesForFolder(folder);
	}
	public static void listFilesForFolder(final File folder) {
		if (folder.isDirectory()) {
		for (final File fileEntry : folder.listFiles()) {

				if (fileEntry.isDirectory()) {
					listFilesForFolder(fileEntry);
				}
				if (fileEntry.isFile()) {
					temp = fileEntry.getName();
					if ((temp.substring(temp.lastIndexOf('.')
							+ 1, temp.length()).toLowerCase()).equals("txt")) System.out.println(
							"File = " + folder.getAbsolutePath() + "\\" + fileEntry.getName());
				} else {

				}
			}
		}
	}
}
