package Arrays;

public class sizeOfATwoDimensionalArrayInJava {
    /*
    Следующий пример помогает определить размер двумерного массива с использованием arrayname.length.
     */
    public static void main(String[] args) {
        String[][] data = new String[2][5];
        System.out.println("Измерение 1: " + data.length);
        System.out.println("Измерение 2: " + data[0].length);
    }
}