package Internatinal_local;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class date {
    static void dates(Locale locale)
    {
        DateFormat format=DateFormat.getDateInstance(DateFormat.FULL,locale);
        Date current=new Date();
        String date=format.format(current);
        System.out.println(date+" "+ locale);
    }

    public static void main(String[] args) {
        dates(Locale.CANADA);
        dates(Locale.JAPAN);
        dates(Locale.KOREA);
    }
}
