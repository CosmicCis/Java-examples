package Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class checkFileExistOrNot2 {
    /*
Problem Description
How to check a file exist or not?

Solution
This example shows how to check a files existence by using file.exists() method of File class.
     */
    public static void main(String[] args) throws IOException {
        File f = new File(System.getProperty("user.dir")+"/folder/file.txt");
        System.out.println(f.exists());

        if(!f.getParentFile().exists()){
            f.getParentFile().mkdirs();
        }
        if(!f.exists()){
            try {
                f.createNewFile();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        try {
            File dir = new File(f.getParentFile(), f.getName());
            PrintWriter pWriter = new PrintWriter(dir);
            pWriter.print("writing anything...");
            pWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
