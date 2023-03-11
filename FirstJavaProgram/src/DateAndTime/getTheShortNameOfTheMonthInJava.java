package DateAndTime;

import java.text.DateFormatSymbols;

public class getTheShortNameOfTheMonthInJava {
    /*
    В этом примере названия месяцев отображаются в краткой форме с помощью метода DateFormatSymbols().getShortMonths() класса DateFormatSymbols.
     */
    public static void main(String[] args) {
        String[] shortMonths = new DateFormatSymbols().getShortMonths();

        for (int i = 0; i < (shortMonths.length-1); i++) {
            String shortMonth = shortMonths[i];
            System.out.println("Короткое название месяца = " + shortMonth);
        }
    }
}
