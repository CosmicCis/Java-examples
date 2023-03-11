package Methods;

public class methodOverloadingInJava2 {
    /*
    В этом примере показан способ перегрузки метода в зависимости от типа и количества параметров.
    Перегрузка путем изменения количества параметров
     */
    private static void display(int a){
        System.out.println("Arguments: " + a);
    }

    private static void display(int a, int b){
        System.out.println("Arguments: " + a + " and " + b);
    }

    public static void main(String[] args) {
        display(1);
        display(1, 4);
    }
}
