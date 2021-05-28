package util;

import Util.DataUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class DateUtilTest {

    @Test
    public void checksIfDateAndWeekend() {
        var isDateWeekend = DataUtils.isWeekend(LocalDate.parse("2021-05-30"));
        Assertions.assertEquals(true, isDateWeekend);
    }

    @Test
    public void checksIfDateAndWeek() {
        var isDateWeek = DataUtils.isWeekend(LocalDate.parse("2021-05-27"));
        Assertions.assertEquals(false, isDateWeek);
    }

    @Test
    public void checksIfAteAndBiSixthYearWeek(){
        var isDateWeek = DataUtils.isWeekend(LocalDate.parse("2024-02-29"));
        Assertions.assertEquals(false, isDateWeek);
    }
}
