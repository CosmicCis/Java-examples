package Files;

import java.io.File;

public class filePathComparison {
    /*
    Problem Description
How to compare paths of two files ?

Solution
This example shows how to compare paths of two files in a same directory by the use of filename.compareTo (another filename) method of File class.
     */

    public static void main(String[] args) {
        File file1 = new File("C:/File/demo1.txt");
        File file2 = new File("C:/java/demo1.txt");

        if (file1.compareTo(file2) == 0) {
            System.out.println("Both paths are same!");
        } else {
            System.out.println("Paths are not same!");
        }
    }
}
