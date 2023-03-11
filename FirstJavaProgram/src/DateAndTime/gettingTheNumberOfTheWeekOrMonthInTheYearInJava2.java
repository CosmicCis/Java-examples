package DateAndTime;
import java.util.Calendar;

public class gettingTheNumberOfTheWeekOrMonthInTheYearInJava2 {
    /*
    В следующем примере отображается номер недели года и месяца, и номер месяца в году.
    Ниже приведен еще один пример отображения недели года, месяца.
     */
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println("Текущая неделя месяца: " + cal.get(Calendar.WEEK_OF_MONTH));
        System.out.println("Текущая неделя года: " + cal.get(Calendar.WEEK_OF_YEAR));
        cal.add(Calendar.YEAR, 1);
        System.out.println(
                "дата через год: " + (cal.get(Calendar.MONTH) + 1) + "-" + cal.get(Calendar.DATE) + "-" + cal.get(Calendar.YEAR));
    }
}
