package Files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class readFile {
    /*
Problem Description
How to read a file ?

Solution
This example shows how to read a file using readLine method of BufferedReader class.
     */

        public static void main(String[] args) {
            try {
                BufferedReader in = new BufferedReader(new FileReader("c:\\java.txt"));
                String str;

                while ((str = in.readLine()) != null) {
                    System.out.println(str);
                }
                System.out.println(str);
            } catch (IOException e) {
            }
        }

}
