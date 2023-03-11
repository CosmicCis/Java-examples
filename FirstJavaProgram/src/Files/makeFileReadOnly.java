package Files;

import java.io.File;

public class makeFileReadOnly {
    /*
Problem Description
How to make a file read-only?

Solution
This example demonstrates how to make a file read-only by using file.setReadOnly() and file.canWrite() methods of File class.
     */
    public static void main(String[] args) {
        File file = new File("C:/java.txt");
        System.out.println(file.setReadOnly());
        System.out.println(file.canWrite());
    }
}
