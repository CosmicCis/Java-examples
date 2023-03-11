package Files;

import java.io.File;

public class checkFileExistOrNot {
    /*
Problem Description
How to check a file exist or not?

Solution
This example shows how to check a files existence by using file.exists() method of File class.
     */
    public static void main(String[] args) {
        File file = new File("C:/java.txt");
        System.out.println(file.exists());
    }
}
