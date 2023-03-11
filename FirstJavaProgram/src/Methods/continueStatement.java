package Methods;

public class continueStatement {
    /*
    В этом примере используется оператор continue для выхода из цикла в методе.
     */
    public static void main(String[] args) {
        StringBuffer searchstr = new StringBuffer(
                "Привет! Как ты?");
        int length = searchstr.length();
        int count = 0;

        for (int i = 0; i < length; i++) {
            if (searchstr.charAt(i) != 'П')continue;
            count++;
            searchstr.setCharAt(i, 'П');
        }
        System.out.println("Найдено " + count + " символ в строке.");
        System.out.println(searchstr);
    }
}
