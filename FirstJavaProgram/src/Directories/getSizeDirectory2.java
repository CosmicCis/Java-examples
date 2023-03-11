package Directories;

import java.io.File;
import java.util.ArrayList;
public class getSizeDirectory2 {
	/*
Problem Description
How to get the size of a directory?

Solution
Following example shows how to get the size of a directory with the help of FileUtils.sizeofDirectory(File Name) method of FileUtils class.
	 */
	public static void main(String[] args) {
		long folderSize = findSize("d:\\a");
		System.out.println("Size in byte :"+folderSize);
	}
	public static long findSize(String path) {
		long totalSize = 0;
		ArrayList<String> directory = new ArrayList<String>();
		File file = new File(path);

		if(file.isDirectory()) {
			directory.add(file.getAbsolutePath());
			while (directory.size() > 0) {
				String folderPath = directory.get(0);
				System.out.println("Size of this :"+folderPath);
				directory.remove(0);
				File folder = new File(folderPath);
				File[] filesInFolder = folder.listFiles();
				int noOfFiles = filesInFolder.length;

				for(int i = 0 ; i < noOfFiles ; i++) {
					File f = filesInFolder[i];
					if(f.isDirectory()) {
						directory.add(f.getAbsolutePath());
					} else {
						totalSize += f.length();
					}
				}
			}
		} else {
			totalSize = file.length();
		}
		return totalSize;
	}
}
