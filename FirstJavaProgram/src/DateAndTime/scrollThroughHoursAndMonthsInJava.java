package DateAndTime;

import java.util.Calendar;
import java.util.Date;

public class scrollThroughHoursAndMonthsInJava {
    /*
    В этом примере показано, как прокручивать месяцы (без изменения года) или часы (без изменения месяца или года), используя метод roll() календаря класса.
     */
    public static void main(String[] args) throws Exception {
        Date d1 = new Date();
        Calendar cl = Calendar. getInstance();

        cl.setTime(d1);
        System.out.println("today is "+ d1.toString());

        cl. roll(Calendar.MONTH, 100);
        System.out.println("дата через месяц будет " + cl.getTime().toString() );

        cl. roll(Calendar.HOUR, 70);
        System.out.println("дата после 7 часов будет "+ cl.getTime().toString() );
    }
}
