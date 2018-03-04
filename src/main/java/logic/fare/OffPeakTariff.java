package logic.fare;

import java.time.LocalDateTime;
import java.util.Vector;

public class OffPeakTariff extends Tariff {

    static Vector<DateTimePeriod> periods = new Vector<>();

    public OffPeakTariff() {
        super();

        periods.add(new DateTimePeriod(
                LocalDateTime.of(1970, 1, 1, 9, 1),
                LocalDateTime.of(1970, 1, 1, 11, 0)));
        periods.add(new DateTimePeriod(
                LocalDateTime.of(1970, 1, 1, 18, 1),
                LocalDateTime.of(1970, 1, 1, 20, 0)));
    }

    public double calculateCost(double journeyCost, LocalDateTime departureDateTime) {
        LocalDateTime dateTime = LocalDateTime.of(1970, 1,1, departureDateTime.getHour(), departureDateTime.getMinute());

        for (DateTimePeriod period: periods) {
            if (dateTime.isAfter(period.getStart()) && dateTime.isBefore(period.getEnd())) {
                return journeyCost * 0.9;
            }
        }

        return journeyCost;
    }

}
