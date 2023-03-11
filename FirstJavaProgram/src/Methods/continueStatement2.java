package Methods;

public class continueStatement2 {
    /*
    В этом примере используется оператор continue для выхода из цикла в методе.
     */
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }

    }
}
