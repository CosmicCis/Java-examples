package Directories;

import java.io.File;

public class directoryEmptyOrNot {
    /*
Problem Description
How to get the fact that a directory is empty or not?

Solution
Following example gets the size of a directory by using file.isDirectory(),file.list() and file.getPath() methods of File class.
     */
    public static void main(String[] args) {
        File file = new File("/data");
        if (file.isDirectory()) {
            String[] files = file.list();
            if (files.length > 0) {
                System.out.println("The " + file.getPath() + " is not empty!");
            }
        }
    }
}
