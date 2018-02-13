package logic.pass;

import logic.journey.Journey;

import java.time.LocalDateTime;

public class Pass {

    private Boolean valid;
    private LocalDateTime dateTimeExpires;

    public Pass(Boolean valid, LocalDateTime dateTimeExpires) {
        this.valid = valid;
        this.dateTimeExpires = dateTimeExpires;
    }

    public Boolean isCovered(Journey journey) {
        return (valid && dateTimeExpires.isAfter(journey.getEndDateTime()));
    }

    @Override
    public String toString() {
        return "Pass{" +
                "valid=" + valid +
                ", dateTimeExpires=" + dateTimeExpires +
                '}';
    }
}
