package Directories;

import java.io.File;

public class deleteDirectory {
    /*
Problem Description
How to delete a directory?

Solution
Following example demonstares how to delete a directory after deleting its files and directories by the use ofdir.isDirectory(),dir.list() and deleteDir() methods of File class.
     */
    public static void main(String[] argv) throws Exception {
        deleteDir(new File("c:\\temp"));
    }
    public static boolean deleteDir(File dir) {
        if (dir.isDirectory()) {
            String[] children = dir.list();
            for (int i = 0; i < children.length; i++) {
                boolean success = deleteDir (new File(dir, children[i]));

                if (!success) {
                    return false;
                }
            }
        }
        return dir.delete();
    }
}
