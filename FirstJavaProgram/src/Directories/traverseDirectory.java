package Directories;

import java.io.File;

public class traverseDirectory {
	/*
Following example demonstratres how to traverse a directory with the help of dir.isDirectory() and dir.list() methods of File class.
	 */
	public static void main(String[] argv) throws Exception {
		System.out.println("The Directory is traversed.");
		visitAllDirsAndFiles(new File("C://Java"));
	}
	public static void visitAllDirsAndFiles(File dir) {
		System.out.println(dir);
		if (dir.isDirectory()) {
			String[] children = dir.list();

			for (int i = 0; i < children.length; i++) {
				visitAllDirsAndFiles(new File(dir, children[i]));
			}
		}
	}
}
