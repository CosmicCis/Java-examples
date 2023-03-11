package Directories;

import java.io.File;

public class createDirectoriesRecursively {
    /*
Problem Description
How to create directories recursively ?

Solution
Following example shows how to create directories recursively with the help of file.mkdirs() methods of File class.
     */

        public static void main(String[] args) {
            String directories = "D:\\a\\b\\c\\d\\e\\f\\g\\h\\i";
            File file = new File(directories);
            boolean result = file.mkdirs();
            System.out.println("Status = " + result);
        }
}
