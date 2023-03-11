package Files;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class createFileInSpecifiedDirectory2 {
    /*
Problem Description
How to create a file in a specified directory ?

Solution
This example demonstrates how to create a file in a specified directory using File.createTempFile() method of File class.
     */

    public static void main(String[] args) throws IOException {
        Path p1 = Paths.get("C:/myfile2.txt");
        Files.createDirectories(p1.getParent());
        try {
            Files.createFile(p1);
        } catch (FileAlreadyExistsException e) {
            System.err.println("already exists: " + e.getMessage());
        }
    }
}
