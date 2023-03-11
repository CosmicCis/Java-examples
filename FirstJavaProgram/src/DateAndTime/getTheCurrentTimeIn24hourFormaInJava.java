package DateAndTime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class getTheCurrentTimeIn24hourFormaInJava {
    /*
    В этом примере время форматируется в 24-часовой формат (00:00–24:00) с использованием метода sdf.format(date) класса SimpleDateFormat.
     */
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("h");
        System.out.println("Час в формате h: " + sdf.format(date));
    }
}
