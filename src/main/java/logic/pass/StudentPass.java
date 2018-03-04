package logic.pass;

import java.time.LocalDateTime;

public class StudentPass extends Pass {

    private double modifier;

    public StudentPass(Boolean valid, LocalDateTime localDateTime) {
        super(valid, localDateTime);

        modifier = 0.5;
    }

    public double getModifier() {
        return modifier;
    }
}
