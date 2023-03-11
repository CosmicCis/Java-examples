package Files;

import java.io.*;

public class copyOneFileIntoAnotherFile {
    /*
Problem Description
How to copy one file into another file ?

Solution
This example shows how to copy contents of one file into another file using read & write methods of BufferedWriter class.
     */
    public static void main(String[] args) throws Exception {
        BufferedWriter out1 = new BufferedWriter(new FileWriter("srcfile"));
        out1.write("string to be copied\n");
        out1.close();
        InputStream in = new FileInputStream(new File("srcfile"));
        OutputStream out = new FileOutputStream(new File("destnfile"));
        byte[] buf = new byte[1024];
        int len;

        while ((len = in.read(buf)) > 0) {
            out.write(buf, 0, len);
        }
        in.close();
        out.close();
        BufferedReader in1 = new BufferedReader(new FileReader("destnfile"));
        String str;

        while ((str = in1.readLine()) != null) {
            System.out.println(str);
        }
        in.close();
    }
}
