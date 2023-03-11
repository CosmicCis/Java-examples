package Methods;

public class Fibonacci {
    /*
    В этом примере показано, как использовать метод расчёта ряда Фибоначчи до чисел.
     */
    public static long fibonacci(long number) {
        if ((number == 0) || (number == 1)) return number;
        else return fibonacci(number - 1) + fibonacci(number - 2);
    }
    public static void main(String[] args) {
        for (int counter = 0; counter <= 10; counter++){
            System.out.printf("Фибоначчи %d это: %d\n", counter, fibonacci(counter));
        }
    }
}
