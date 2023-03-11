package Files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class writeFile2 {
    /*
Problem Description
How to write into a file ?

Solution
This example shows how to write to a file using write method of BufferedWriter.
     */
    public static void main(String[] args) {
        try {
            String content = "GitHub is one the best site in the world";
            File file = new File("C:\\abc.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            bw.close();

            System.out.println("Done");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
