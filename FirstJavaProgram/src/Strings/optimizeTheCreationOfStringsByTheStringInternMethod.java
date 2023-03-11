package Strings;

public class optimizeTheCreationOfStringsByTheStringInternMethod {
    /*
    В следующем примере оптимизируется создание строки с помощью метода String.intern().
     */
    public static void main(String[] args) {
        String variables[] = new String[50000];
        for( int i = 0; i < 50000; i++) {
            variables[i] = "s"+i;
        }
        long startTime0 = System.currentTimeMillis();

        for(int i = 0; i < 50000; i++) {
            variables[i] = "привет";
        }
        long endTime0 = System.currentTimeMillis();
        System.out.println("Время создания"
                + " строковых литералов: "+ (endTime0 - startTime0)
                + " мс" );
        long startTime1 = System.currentTimeMillis();

        for(int i = 0; i < 50000; i++) {
            variables[i] = new String("привет");
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("Время создания"
                + " строковых объектов с «новым» ключевым словом:"
                + (endTime1 - startTime1)
                + " мс");
        long startTime2 = System.currentTimeMillis();

        for(int i = 0; i < 50000; i++) {
            variables[i] = new String("привет");
            variables[i] = variables[i].intern();
        }
        long endTime2 = System.currentTimeMillis();
        System.out.println("Время создания"
                + " строковых объектов с intern(): "
                + (endTime2 - startTime2)
                + " мс");
    }
}
