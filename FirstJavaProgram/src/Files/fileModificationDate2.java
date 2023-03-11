package Files;
import java.io.File;
import java.text.SimpleDateFormat;

public class fileModificationDate2 {
    /*
Problem Description
How to get last modification date of a file ?

Solution
This example shows how to get the last modification date of a file using file.lastModified() method of File class.
     */
    public static void main(String[] args) {
        File file = new File("Main.java");
        System.out.println("Before Format : " + file.lastModified());
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        System.out.println("After Format : " + sdf.format(file.lastModified()));
    }
}
