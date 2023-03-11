package Files;

import java.io.File;
import java.io.IOException;

public class createTemporaryFile2 {
    /*
Problem Description
How to create a temporary file ?

Solution
This example shows how to create a temporary file using createTempFile() method of File class.
     */
    public static void main(String[] args) {
        try {
            File f1 = File.createTempFile("temp-file-name", ".tmp");
            System.out.println("Temp file : " + f1.getAbsolutePath());
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}