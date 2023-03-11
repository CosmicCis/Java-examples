package Arrays;
import java.util.Arrays;
public class checkWhetherTwoArraysAreEqualOrNotInJava {
    /*
    В следующем примере показано, как использовать метод equals() для массивов, чтобы проверить равны ли два массива или нет в Java.
     */
    public static void main(String[] args) throws Exception {
        int[] ary = {1,2,3,4,5,6};
        int[] ary1 = {1,2,3,4,5,6};
        int[] ary2 = {1,2,3,4};
        System.out.println("Массив1 равен массиву2? " +Arrays.equals(ary, ary1));
        System.out.println("Массив1 равен массиву3? " +Arrays.equals(ary, ary2));
    }
}
