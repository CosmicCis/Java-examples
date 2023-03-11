package Directories;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class searchFilesInsideDirectory2 {
	/*
Problem Description
How to search all files inside a directory?

Solution
Following example demonstrares how to search and get a list of all files under a specified directory by using dir.list() method of File class.
	 */
	public static void main(String[] args) throws IOException {
		System.out.println("Enter the path to folder to search for files");
		Scanner s1 = new Scanner(System.in);
		String folderPath = s1.next();
		File folder = new File(folderPath);

		if (folder.isDirectory()) {
			File[] listOfFiles = folder.listFiles();
			if (listOfFiles.length < 1)System.out.println(
					"There is no File inside Folder");
			else System.out.println("List of Files & Folder");
			for (File file : listOfFiles) {
				if(!file.isDirectory())System.out.println(
						file.getCanonicalPath().toString());
			}
		}
		else System.out .println("There is no Folder @ given path :" + folderPath);
	}
}
