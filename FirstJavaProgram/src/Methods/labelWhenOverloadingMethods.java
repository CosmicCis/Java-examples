package Methods;

public class labelWhenOverloadingMethods {
    /*
    В этом примере показано, как перейти к определенной метке, когда в цикле встречаются операторы break или continue.
     */
    public static void main(String[] args) {
        String strSearch = "Это строка, в которой вы должны искать подстроку.";
        String substring = "подстроку";
        boolean found = false;
        int max = strSearch.length() - substring.length();
        testlbl: for (int i = 0; i <= max; i++) {
            int length = substring.length();
            int j = i;
            int k = 0;
            while (length-- != 0) {
                if(strSearch.charAt(j++) != substring.charAt(k++)){
                    continue testlbl;
                }
            }
            found = true;
            break testlbl;
        }
        if (found) {
            System.out.println("Нашел подстроку.");
        } else {
            System.out.println("Не нашел подстроку в строке.");
        }
    }
}
