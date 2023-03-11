package Files;

import java.io.*;

public class copyOneFileIntoAnotherFile2 {
    /*
Problem Description
How to copy one file into another file ?

Solution
This example shows how to copy contents of one file into another file using read & write methods of BufferedWriter class.
     */
    public static void main(String[] args) {
        FileInputStream ins = null;
        FileOutputStream outs = null;
        try {
            File infile = new File("C:\\abc.txt");
            File outfile = new File("C:\\bbc.txt");
            ins = new FileInputStream(infile);
            outs = new FileOutputStream(outfile);
            byte[] buffer = new byte[1024];
            int length;

            while ((length = ins.read(buffer)) > 0) {
                outs.write(buffer, 0, length);
            }
            ins.close();
            outs.close();
            System.out.println("File copied successfully!!");
        } catch(IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
