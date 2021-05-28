package Util;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

import static java.util.Calendar.*;

public class DataUtils {

    public static boolean isWeekend(LocalDate localDate) {
        DayOfWeek d = localDate.getDayOfWeek();
        return d == DayOfWeek.SATURDAY || d == DayOfWeek.SUNDAY;
    }
}
