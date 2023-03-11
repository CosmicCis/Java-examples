package Files;

import java.io.File;
import java.text.SimpleDateFormat;

public class changeTheLastModificationTimeOfFile2 {
    /*
Problem Description
How to change the last modification time of a file ?

Solution
This example shows how to change the last modification time of a file with the help of fileToChange.lastModified() and fileToChange setLastModified() methods of File class.
     */
    public static void main(String[] args) {
        File f1 = new File("C:\\abc.png");
        System.out.println("Before Format : " + f1.lastModified());
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        System.out.println("After Format : " + sdf.format(f1.lastModified()));
    }
}
