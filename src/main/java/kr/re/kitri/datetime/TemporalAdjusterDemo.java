package kr.re.kitri.datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjusterDemo {
    public static void main(String[] args) {
        LocalDate wDay = LocalDate.of(2020, 3, 14);

        LocalDate theDay = wDay.with(TemporalAdjusters.lastInMonth(DayOfWeek.WEDNESDAY));
        System.out.println(theDay);

        LocalDate today = LocalDate.now();

        LocalDate theDay2 = today.with(new NextGymDayOff());
        System.out.println("다음주 수요일은 : " + theDay2);
    }
}
