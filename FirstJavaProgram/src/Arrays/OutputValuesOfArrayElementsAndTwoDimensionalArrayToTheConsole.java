package Arrays;

public class OutputValuesOfArrayElementsAndTwoDimensionalArrayToTheConsole {
    /*
    В следующем примере демонстрируется вывод элементов массива в консоль с помощью цикла.
     */
    public static void main(String[] args) {
        String[] greeting = new String[3];
        greeting[0] = "Это приветствие";
        greeting[1] = "для всех читателей от";
        greeting[2] = "исходного кода Java.";

        for (int i = 0; i < greeting.length; i++){
            System.out.println(greeting[i]);
        }
    }
}
