package Methods;

public class breakOperator {
    /*
    В этом примере используется «break», чтобы выйти из цикла.
     */
    public static void main(String[] args) {
        int[] intary = { 99,12,22,34,45,67,5678,8990 };
        int no = 5678;
        int i = 0;
        boolean found = false;

        for ( ; i < intary.length; i++) {
            if (intary[i] == no) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Найден no: " + no + " в индексе: " + i);
        } else {
            System.out.println(no + "в массиве не найден");
        }
    }
}
