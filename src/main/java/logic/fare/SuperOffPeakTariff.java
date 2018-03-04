package logic.fare;

import java.time.LocalDateTime;
import java.util.Vector;

public class SuperOffPeakTariff extends Tariff {

    static Vector<DateTimePeriod> periods = new Vector<>();

    public SuperOffPeakTariff() {
        super();

        periods.add(new DateTimePeriod(
                LocalDateTime.of(1970, 1, 1, 0, 0),
                LocalDateTime.of(1970, 1, 1, 5, 59)));
        periods.add(new DateTimePeriod(
                LocalDateTime.of(1970, 1, 1, 11, 1),
                LocalDateTime.of(1970, 1, 1, 15, 59)));
        periods.add(new DateTimePeriod(
                LocalDateTime.of(1970, 1, 1, 20, 1),
                LocalDateTime.of(1970, 1, 1, 23, 59)));
    }

    public double calculateCost(double journeyCost, LocalDateTime departureDateTime) {
        LocalDateTime dateTime = LocalDateTime.of(1970, 1,1, departureDateTime.getHour(), departureDateTime.getMinute());

        for (DateTimePeriod period: periods) {
            if (dateTime.isAfter(period.getStart()) && dateTime.isBefore(period.getEnd())) {
                return journeyCost * 0.75;
            }
        }

        return journeyCost;
    }

}
