package Strings;

public class mergeStringsOrConcatenateStrings {
    /*
    В следующем примере показана производительность конкатенации (объединения) с использованием оператора «+» и метода StringBuffer.append().
     */
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        for(int i = 0; i < 5000; i++) {
            String result = "Это "
                    + "тестирование "
                    + "разницы "+ "между "
                    + "String"+ " и "+ "StringBuffer";
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Время, затраченное на "
                + "конкатенацию строк с использованием оператора +:"
                + (endTime - startTime)+ " мс");
        long startTime1 = System.currentTimeMillis();

        for(int i = 0; i < 5000; i++) {
            StringBuffer result = new StringBuffer();
            result.append("Это ");
            result.append("тестирование ");
            result.append("разницы ");
            result.append("между ");
            result.append("String");
            result.append(" и ");
            result.append("StringBuffer");
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("Время, затраченное на конкатенацию строк "
                + "с использованием StringBuffer: "
                + (endTime1 - startTime1)+ " мс");
    }
}
