import java.time.LocalDateTime;

public class Tariffs {

    private int type;
    private float cost;
    private LocalDateTime start;
    private LocalDateTime end;
    //private TimeBandRegistry timePeriods;
    //private TimeBandRegistry peakPeriods;
    private boolean peakAllowed;

    public Tariffs() {

    }

    public double calculateRouteCost(Route route, LocalDateTime start, LocalDateTime end) {
        return 0.0;
    }
}
