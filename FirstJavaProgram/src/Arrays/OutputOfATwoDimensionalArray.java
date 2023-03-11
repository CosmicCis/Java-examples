package Arrays;
import java.util.Arrays;
public class OutputOfATwoDimensionalArray {
    /*
    В следующем примере демонстрируется как выводить двумерный массив в Java на экран с помощью цикла.
     */

    public static void main(String[] args) {
        String[][] deepArr = new String[][]{{"Олег", "Юра"}, {"Женя", "Никита"}};
        System.out.println(Arrays.toString(deepArr));
        System.out.println(Arrays.deepToString(deepArr));

    }
}
