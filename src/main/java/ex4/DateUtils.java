package ex4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

    private static String format(Date date, String pattern) {
        SimpleDateFormat formateur = new SimpleDateFormat(pattern);
        return formateur.format(date);
    }

    public static String format(String pattern, Date date) {
        return format(date, pattern);
    }

    public static String formatDefaut(Date date) {
        return format(date, "dd/MM/yyyy HH:mm:ss");
    }
}
