package Files;

import java.io.File;

public class getFilesSizeInBytes {
    /*
Problem Description
How to get a files size in bytes ?

Solution
This example shows how to get a file's size in bytes by using file.exists() and file.length() method of File class.
     */
    public static long getFileSize(String filename) {
        File file = new File(filename);
        if (!file.exists() || !file.isFile()) {
            System.out.println("File doesn\'t exist");
            return -1;
        }
        return file.length();
    }
    public static void main(String[] args) {
        long size = getFileSize("c:/java.txt");
        System.out.println("Filesize in bytes: " + size);
    }
}
