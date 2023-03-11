package Directories;

import java.io.File;
import java.io.IOException;

public class printHierarchyDirectoryJava {
	/*
Problem Description
How to print the hierarchy of directory?

Solution
Following example shows how to print the hierarchy of a specified directory using file.getName() and file.listFiles() method of File class.
	 */
	public static void main(String[] a)throws IOException{
		showDir(1, new File("d:\\Java"));
	}
	static void showDir(int indent, File file) throws IOException {
		for (int i = 0; i < indent; i++) System.out.print('-');
		System.out.println(file.getName());
		if (file.isDirectory()) {
			File[] files = file.listFiles();
			for (int i = 0; i < files.length; i++)showDir(indent + 4, files[i]);
		}
	}
}