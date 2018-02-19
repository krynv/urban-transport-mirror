package logic.timeband;

import logic.timeband.TimeBand;

import java.util.ArrayList;

public class TimeRegistry extends ArrayList<TimeBand> {
    public TimeRegistry() {
        super();
    }

    public void addTimeBand(TimeBand aTimeBand) {
        super.add(aTimeBand);
    }
}


