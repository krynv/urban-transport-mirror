package logic.pass;

import java.time.LocalDateTime;

public class DayPass extends Pass {

    private double modifier;

    public DayPass(Boolean valid, LocalDateTime localDateTime) {
        super(valid, localDateTime);

        modifier = 15.00;
    }

    public double getModifier() {
        return modifier;
    }
}
