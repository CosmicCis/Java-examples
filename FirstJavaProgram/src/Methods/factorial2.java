package Methods;

public class factorial2 {
    /*
    В этом примере показан расчёт вычисления факториала из 10 чисел с использованием цикла for.
     */
    public static void main(String[] args) {
        int number = 5;
        int factorial = number;

        for(int i = (number - 1); i > 1; i--) {
            factorial = factorial * i;
        }
        System.out.println("Факториал 5 это " + factorial);
    }
}
