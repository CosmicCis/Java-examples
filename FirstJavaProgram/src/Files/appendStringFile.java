package Files;

import java.io.*;

import static java.lang.System.in;

public class appendStringFile {
    /*
Problem Description
How to append a string in an existing file ?

Solution
This example shows how to append a string in an existing file using filewriter method.
     */
    public static void main(String[] args) throws Exception {
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("filename"));
            out.write("aString1\n");
            out.close();
            out = new BufferedWriter(new FileWriter("filename",true));
            out.write("aString2");
            out.close();
            BufferedReader in = new BufferedReader(new FileReader("filename"));
            String str;

            while ((str = in.readLine()) != null) {
                System.out.println(str);
            }
            in.close();
        }
        catch (IOException e) {
            System.out.println("exception occoured"+ e);
        }
    }
}
