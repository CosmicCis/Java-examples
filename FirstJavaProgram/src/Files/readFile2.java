package Files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class readFile2 {
    /*
Problem Description
How to read a file ?

Solution
This example shows how to read a file using readLine method of BufferedReader class.
     */

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(
                new FileReader("C:\\java.txt"))) {

            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                System.out.println(sCurrentLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
