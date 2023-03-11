package DateAndTime;

import java.text.DateFormatSymbols;

public class dayOfTheWeekInJava {
    /*
    Будние дни.
    В этом примере названия дней недели выводятся с помощью метода DateFormatSymbols().getWeekdays() класса DateFormatSymbols.
     */
    public static void main(String[] args) {
        String[] weekdays = new DateFormatSymbols().getWeekdays();


        DateFormatSymbols dfs = new DateFormatSymbols();
        String[] dayNames = dfs.getWeekdays();
        dayNames[0] = "Monday";
        dfs.setWeekdays(dayNames);

        System.out.println("The week starts on Monday: ");
        for (int i = 0; i < dayNames.length; i++) {
            System.out.println(dayNames[i]);


            for (i = 2; i < (weekdays.length - 1); i++) {
                String weekday = weekdays[i];
                System.out.println("День недели = " + weekday);
            }
            for (i = 0; i <= 7; i++) {
                System.out.println(weekdays[i]);
            }
        }
    }
}
