package Directories;

import java.io.File;
import java.io.IOException;

public class displayDirectoriesDirectory2 {
	/*
Problem Description
How to display all the directories in a directory?

Solution
Following example shows how to display all the directories contained in a directory making a filter which list method of File class.
	 */
	public static void main(String[] args) {
		File currentDir = new File(".");
		displayDirectoryContents(currentDir);
	}
	public static void displayDirectoryContents(File dir) {
		try {
			File[] files = dir.listFiles();
			for (File file : files) {
				if (file.isDirectory()) {
					System.out.println("directory:" + file.getCanonicalPath());
					displayDirectoryContents(file);
				} else {
					System.out.println("     file:" + file.getCanonicalPath());
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
