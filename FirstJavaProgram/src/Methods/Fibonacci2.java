package Methods;

public class Fibonacci2 {
    /*
    В этом примере показано, как использовать метод расчёта ряда Фибоначчи до чисел.
     */
    public static void main(String a[]) {
        int count = 15;
        int[] feb = new int[count];
        feb[0] = 0;
        feb[1] = 1;

        for(int i = 2; i < count; i++) {
            feb[i] = feb[i-1] + feb[i-2];
        }
        for(int i = 0; i < count; i++) {
            System.out.print(feb[i] + " ");
        }
    }
}
