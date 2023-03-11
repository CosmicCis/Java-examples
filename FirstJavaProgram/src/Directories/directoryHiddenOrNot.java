package Directories;

import java.io.File;

public class directoryHiddenOrNot {
    /*
Problem Description
How to get a directory is hidden or not?

Solution
Following example demonstrates how to get the fact that a file is hidden or not by using file.isHidden() method of File class.
     */
    public static void main(String[] args) {
        File file = new File("C:/Demo.txt");
        System.out.println(file.isHidden());
    }
}
