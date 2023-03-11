package Arrays;

public class increaseTheArrayAfterInitializationInJava {
    /*
    В следующем примере показано, как расширить массив после инициализации, создав новый массив.
     */
    public static void main(String[] args) {
        String[] names = new String[] { "А", "Б", "В" };
        String[] extended = new String[5];
        extended[3] = "Г";
        extended[4] = "Д";
        System.arraycopy(names, 0, extended, 0, names.length);

        for (String str : extended){
            System.out.println(str);
        }
    }
}
