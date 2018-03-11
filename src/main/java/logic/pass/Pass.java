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

    /**
     *
     * @param journey selects current journey
     * @return true or false depending if the journey is covered
     */
    public Boolean isCovered(Journey journey) {
        return (valid && dateTimeExpires.isAfter(journey.getDepartureDateTime()));
    }
    /**
     *
     * @return true or false depending if its valid
     */
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
