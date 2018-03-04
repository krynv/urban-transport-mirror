package logic.fare;

import java.time.LocalDateTime;

public class DateTimePeriod {
    private LocalDateTime start;
    private LocalDateTime end;

    public DateTimePeriod(LocalDateTime start, LocalDateTime end) {
        this.start = start;
        this.end = end;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public LocalDateTime getEnd() {
        return end;
    }
}
