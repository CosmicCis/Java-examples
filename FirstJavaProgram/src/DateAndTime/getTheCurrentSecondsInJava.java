package DateAndTime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class getTheCurrentSecondsInJava {
    /*
    В этом примере секунды форматируются с помощью конструктора SimpleDateFormat('ss') и метода sdf.format(date) класса SimpleDateFormat.
     */
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("ss");
        System.out.println("Секунды в формате ss: " + sdf.format(date));
    }
}
