package logic.pass;

import logic.journey.Journey;

import java.time.LocalDateTime;

public class Pass {

    private Boolean valid;
    private LocalDateTime dateTimeExpires;
    private double modifier;

    public Pass(Boolean valid, LocalDateTime dateTimeExpires) {
        this.valid = valid;
        this.dateTimeExpires = dateTimeExpires;
    }

    public Boolean isCovered(Journey journey) {
        return (valid && dateTimeExpires.isAfter(journey.getDepartureDateTime()));
    }

    public Boolean isValid() {
        return (valid && dateTimeExpires.isAfter(LocalDateTime.now()));
    }

    public double getModifier() {
        return modifier;
    }

    public void invalidate() {
        valid = false;
    }

    @Override
    public String toString() {
        return "Pass{" +
                "valid=" + valid +
                ", dateTimeExpires=" + dateTimeExpires +
                '}';
    }
}
