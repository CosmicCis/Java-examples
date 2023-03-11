package Arrays;
import java.util.Arrays;
public class compareTwoArrays {
    public static void main(String[] args) throws Exception {
        int[] ary = {1,2,3,4,5,6};
        int[] ary1 = {1,2,3,4,5,6};
        int[] ary2 = {1,2,3,4};

        System.out.println("Массив1 равен массиву 2? "
                +Arrays.equals(ary, ary1));
        System.out.println("Массив1 равен массиву 3? "
                +Arrays.equals(ary, ary2));
    }
}
