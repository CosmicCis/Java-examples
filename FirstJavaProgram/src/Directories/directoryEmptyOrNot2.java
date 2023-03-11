package Directories;

import java.io.File;

public class directoryEmptyOrNot2 {
    /*
Problem Description
How to get the fact that a directory is empty or not?

Solution
Following example gets the size of a directory by using file.isDirectory(),file.list() and file.getPath() methods of File class.
     */
    public static void main(String[] args) {
        File file = new File("C:\\New folder");
        if(file.isDirectory()){
            if(file.list().length > 0) {
                System.out.println("Directory is not empty!");
            } else {
                System.out.println("Directory is empty!");
            }
        } else {
            System.out.println("This is not a directory");
        }
    }
}
