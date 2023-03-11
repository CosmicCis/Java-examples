package Files;

// Java Program to rename a file
import java.io.File;
public class renameFile {
    public static void main(String[] args)
    {
        // Create an object of the File class
        // Replace the file path with path of the directory
        File file = new File("/home/mayur/Folder/GFG.java");

        // Create an object of the File class
        // Replace the file path with path of the directory
        File rename = new File("/home/mayur/Folder/HelloWorld.java");

        // store the return value of renameTo() method in
        // flag
        boolean flag = file.renameTo(rename);

        // if renameTo() return true then if block is
        // executed
        if (flag == true) {
            System.out.println("File Successfully Rename");
        }
        // if renameTo() return false then else block is
        // executed
        else {
            System.out.println("Operation Failed");
        }
    }
}
