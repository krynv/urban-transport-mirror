package logic.fare;

import java.time.LocalDateTime;
import java.util.Vector;

public class NormalPeakTariff extends Tariff {

    static Vector<DateTimePeriod> periods = new Vector<>();

    public NormalPeakTariff() {
        super();

        periods.add(new DateTimePeriod(
                LocalDateTime.of(1970, 1, 1, 6, 0),
                LocalDateTime.of(1970, 1, 1, 9, 0)));
        periods.add(new DateTimePeriod(
                LocalDateTime.of(1970, 1, 1, 16, 0),
                LocalDateTime.of(1970, 1, 1, 18, 0)));
    }

    public double calculateCost(double journeyCost, LocalDateTime departureDateTime) {
        LocalDateTime dateTime = LocalDateTime.of(1970, 1,1, departureDateTime.getHour(), departureDateTime.getMinute());

        for (DateTimePeriod period: periods) {
            if (dateTime.isAfter(period.getStart()) && dateTime.isBefore(period.getEnd())) {
                return journeyCost;
            }
        }

        return journeyCost;
    }

}
