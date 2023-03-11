package Files;

import java.io.File;
import java.util.Date;

public class changeTheLastModificationTimeOfFile {
    /*
Problem Description
How to change the last modification time of a file ?

Solution
This example shows how to change the last modification time of a file with the help of fileToChange.lastModified() and fileToChange setLastModified() methods of File class.
     */
    public static void main(String[] args) throws Exception {
        File fileToChange = new File("C:/myjavafile.txt");
        fileToChange.createNewFile();
        Date filetime = new Date (fileToChange.lastModified());
        System.out.println(filetime.toString());
        System.out.println (fileToChange.setLastModified (System.currentTimeMillis()));
        filetime = new Date (fileToChange.lastModified());
        System.out.println(filetime.toString());
    }
}
