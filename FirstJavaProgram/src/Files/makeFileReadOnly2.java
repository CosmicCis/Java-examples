package Files;

import java.io.File;
import java.io.IOException;

public class makeFileReadOnly2 {
    /*
Problem Description
How to make a file read-only?

Solution
This example demonstrates how to make a file read-only by using file.setReadOnly() and file.canWrite() methods of File class.
     */
    public static void main(String[] args) throws IOException {
        File file = new File("c:/file.txt");
        file.setReadOnly();

        if(file.canWrite()) {
            System.out.println("This file is writable");
        } else {
            System.out.println("This file is read only");
        }
        file.setWritable(true);
        if(file.canWrite()) {
            System.out.println("This file is writable");
        } else {
            System.out.println("This file is read only");
        }
    }
}
