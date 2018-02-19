package logic.timeband;

import java.time.LocalDateTime;

public class TimeBand {

    private int timeBandID;
    private LocalDateTime timeStart;
    private LocalDateTime timeEnd;
    private boolean peak;

    public TimeBand(int id, LocalDateTime start, LocalDateTime end, boolean aPeak) {
        timeBandID = id;
        timeStart = start;
        timeEnd = end;
        peak = aPeak;
    }



}
