package Files;

import java.io.File;

public class createFileInSpecifiedDirectory {
    /*
Problem Description
How to create a file in a specified directory ?

Solution
This example demonstrates how to create a file in a specified directory using File.createTempFile() method of File class.
     */

        public static void main(String[] args) throws Exception {
            File file = null;
            File dir = new File("C:/");
            file = File.createTempFile("JavaTemp", ".javatemp", dir);
            System.out.println(file.getPath());
        }
}
