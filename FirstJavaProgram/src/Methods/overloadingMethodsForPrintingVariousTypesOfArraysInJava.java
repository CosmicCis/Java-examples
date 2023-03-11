package Methods;

public class overloadingMethodsForPrintingVariousTypesOfArraysInJava {
    /*
    В этом примере показан способ использования перегруженного метода для печати типов массива (integer, double and character).
     */
    public static void printArray(Integer[] inputArray) {
        for (Integer element : inputArray){
            System.out.printf("%s ", element);
            System.out.println();
        }
    }
    public static void printArray(Double[] inputArray) {
        for (Double element : inputArray){
            System.out.printf("%s ", element);
            System.out.println();
        }
    }
    public static void printArray(Character[] inputArray) {
        for (Character element : inputArray){
            System.out.printf("%s ", element);
            System.out.println();
        }
    }
    public static void main(String args[]) {
        Integer[] integerArray = { 1, 2, 3, 4, 5, 6 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7 };
        Character[] characterArray = { 'П', 'Р', 'И', 'В', 'Е', 'Т' };

        System.out.println("Массив integerArray содержит:");
        printArray(integerArray);

        System.out.println("\nМассив doubleArray содержит:");
        printArray(doubleArray);

        System.out.println("\nМассив characterArray содержит:");
        printArray(characterArray);
    }
}
