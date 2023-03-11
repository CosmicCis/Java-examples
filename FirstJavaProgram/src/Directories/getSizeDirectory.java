package Directories;

import org.apache.commons.io.FileUtils;

import java.io.File;
public class getSizeDirectory {
	/*
Problem Description
How to get the size of a directory?

Solution
Following example shows how to get the size of a directory with the help of FileUtils.sizeofDirectory(File Name) method of FileUtils class.
	 */
	public static void main(String[] args) {
		try {
			long size = FileUtils.sizeOfDirectory(new File("C:/Microsoft"));
			System.out.println("Size: " + size + " bytes");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
