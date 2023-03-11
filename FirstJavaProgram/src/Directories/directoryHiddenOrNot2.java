package Directories;

import java.io.File;
import java.io.IOException;

public class directoryHiddenOrNot2 {
    /*
Problem Description
How to get a directory is hidden or not?

Solution
Following example demonstrates how to get the fact that a file is hidden or not by using file.isHidden() method of File class.
     */

        public static void main(String[] args) throws IOException {
            File file = new File("C:\\abc.txt");
            if(file.isHidden()) {
                System.out.println("This file is hidden");
            } else {
                System.out.println("This file is not hidden");
            }
        }
}
