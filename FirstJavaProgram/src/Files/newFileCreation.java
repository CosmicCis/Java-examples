package Files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class newFileCreation {
    /*
    Problem Description
How to create a new file ?

Solution
This example demonstrates the way of creating a new file by using File() constructor and file.createNewFile() method of File class.
     */
    private static void createFileUsingFileOutputStreamClass() throws IOException {
        createFileUsingFileOutputStreamClass();

        String data = "Test data";
        FileOutputStream out = new FileOutputStream("c://testFile2.txt");
        out.write(data.getBytes());
        out.close();
    }
    public static void main(String[] args) {
        try {
            File file = new File("C:/testFile2.txt");

            if(file.createNewFile())System.out.println("Success!");
            else System.out.println ("Error, file already exists.");
        }
        catch(IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
