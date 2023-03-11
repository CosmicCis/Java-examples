package DateAndTime;

import java.util.Calendar;

public class scrollThroughHoursAndMonthsInJava2 {
    /*
    В этом примере показано, как прокручивать месяцы (без изменения года) или часы (без изменения месяца или года), используя метод roll() календаря класса.
    Ниже приведен еще один пример.
    */
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println("Время: " + cal.getTime());

        cal.roll(Calendar.YEAR, false);
        System.out.println("Время -1 год: " + cal.getTime());

        cal.roll(Calendar.HOUR, true);
        System.out.println("Время +1 час: " + cal.getTime());
    }
}
