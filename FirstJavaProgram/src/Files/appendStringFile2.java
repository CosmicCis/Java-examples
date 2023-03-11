package Files;

import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class appendStringFile2 {
    /*
Problem Description
How to append a string in an existing file ?

Solution
This example shows how to append a string in an existing file using filewriter method.
     */
    public static void main( String[] args ) {
        try {
            String data = " Tutorials Point is a best website in the world";
            File f1 = new File("C:\\abc.txt");
            if(!f1.exists()) {
                f1.createNewFile();
            }
            FileWriter fileWritter = new FileWriter(f1.getName(),true);
            BufferedWriter bw = new BufferedWriter(fileWritter);
            bw.write(data);
            bw.close();
            System.out.println("Done");
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
