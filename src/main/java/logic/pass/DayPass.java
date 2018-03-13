package logic.pass;

import java.time.LocalDateTime;

public class DayPass extends Pass {

    public DayPass(Boolean valid, LocalDateTime dateTimeExpires, double modifier, String name) {
        super(valid, dateTimeExpires, modifier, name);
    }

    public String getName() {
        return super.getName();
    }

    public void setName(String name) {
        super.setName(name);
    }

    public double getModifier() {
        return super.getModifier();
    }

    public void setModifier(double modifier) {
        super.setModifier(modifier);
    }
}
