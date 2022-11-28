package Java_Standard_10;

import java.time.LocalDate;
import static java.time.DayOfWeek.*;
import java.time.temporal.*;
import static java.time.temporal.TemporalAdjuster.*;

public class TentoTwentyfour implements TemporalAdjuster {

    @Override
    public Temporal adjustInto(Temporal temporal) {
        // TODO Auto-generated method stub
        return temporal.plus(2, ChronoUnit.DAYS);
    }

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate date = today.with(new TentoTwentyfour());

//        p(today);
//        p(date);
//        p(today.with(firstDayOfNextWonth()));
//        p(today.with(firstDayOfMonth()));
//        p(today.with(lastDayOfMonth()));
//        p(today.with(firstInMonth(TUESDAY)));
//        p(today.with(lastInMonth(TUESDAY)));
//        p(today.with(previous(TUESDAY)));
//        p(today.with(PreviousOrSame(TUESDAY)));
//        p(today.with(next(TUESDAY)));
//        p(today.with(nextOrSame(TUESDAY)));
//        p(today.with(dayOfWeekInMonth(4, TUESDAY)));

    }

    static void p(Object obj) {
        System.out.println(obj);
    }
}
