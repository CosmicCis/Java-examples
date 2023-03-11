package Files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class writeFile {
    /*
Problem Description
How to write into a file ?

Solution
This example shows how to write to a file using write method of BufferedWriter.
     */
    public static void main(String[] args) {
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("outfilename"));
            out.write(out.toString());
            out.close();
            System.out.println("File created successfully");
        }
        catch (IOException e) {
        }
    }
}
