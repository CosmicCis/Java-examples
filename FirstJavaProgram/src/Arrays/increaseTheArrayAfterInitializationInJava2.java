package Arrays;

public class increaseTheArrayAfterInitializationInJava2 {
    /*
    В следующем примере показано, как расширить массив после инициализации, создав новый массив.
    Ниже приведен еще один пример расширения массивов в Java.
     */
    public static void main(String[] args) {
        String[] names = new String[] {"Олег", "Никита", "Костя"};
        String[] extended = new String[5];
        extended[3] = "Кристина";
        extended[4] = "Аня";
        System.arraycopy(names, 0, extended, 0, names.length);

        for (String str : extended){
            System.out.println(str);
        }
    }
}