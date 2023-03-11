package Strings;

public class compareStringCreationPerformanceInJava {
    /*
    В следующем примере сравнивается производительность двух строк, созданных двумя разными способами.
     */
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        for(int i = 0; i < 50000; i++) {
            String s1 = "привет";
            String s2 = "привет";
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Время, затраченное на создание"
                + " строковых литералов:"+ (endTime - startTime)
                + " миллисекунд" );
        long startTime1 = System.currentTimeMillis();

        for(int i = 0; i < 50000; i++) {
            String s3 = new String("привет");
            String s4 = new String("привет");
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("Время, затраченное на создание"
                + " строковых объектов: " + (endTime1 - startTime1)
                + " миллисекунд");
    }
}
