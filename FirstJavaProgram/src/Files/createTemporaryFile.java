package Files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class createTemporaryFile {
    /*
Problem Description
How to create a temporary file ?

Solution
This example shows how to create a temporary file using createTempFile() method of File class.
не работает
     */
    public static void main(String[] args) throws Exception {
        File temp = File.createTempFile ("pattern", ".suffix");
        temp.deleteOnExit();
        BufferedWriter out = new BufferedWriter (new FileWriter(temp));
        out.write("aString");
        System.out.println("temporary file created:");
        out.close();
    }
}