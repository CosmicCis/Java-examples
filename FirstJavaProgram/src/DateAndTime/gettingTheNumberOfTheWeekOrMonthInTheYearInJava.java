package DateAndTime;

import java.util.Calendar;
import java.util.Date;

public class gettingTheNumberOfTheWeekOrMonthInTheYearInJava {
    /*
    В следующем примере отображается номер недели года и месяца, и номер месяца в году.
     */
    public static void main(String[] args) throws Exception {
        Date d1 = new Date();
        Calendar cl = Calendar. getInstance();
        cl.setTime(d1);

        System.out.println("сегодня " + cl.WEEK_OF_YEAR+ " неделя года");
        System.out.println("сегодня "+cl.DAY_OF_MONTH + " месяц года");
        System.out.println("сегодня "+cl.WEEK_OF_MONTH +" неделя месяца");
    }
}
