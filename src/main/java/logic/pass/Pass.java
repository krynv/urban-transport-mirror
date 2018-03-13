package logic.pass;

import logic.journey.Journey;

import java.time.LocalDateTime;

public class Pass {

    private Boolean valid;
    private LocalDateTime dateTimeExpires;
    private double modifier;
    private String name;

    public Pass(Boolean valid, LocalDateTime dateTimeExpires, double modifier, String name) {
        this.valid = valid;
        this.dateTimeExpires = dateTimeExpires;
        this.modifier = modifier;
        this.name = name;
    }

    public Boolean getValid() {
        return valid;
    }

    public void setValid(Boolean valid) {
        this.valid = valid;
    }

    public LocalDateTime getDateTimeExpires() {
        return dateTimeExpires;
    }

    public void setDateTimeExpires(LocalDateTime dateTimeExpires) {
        this.dateTimeExpires = dateTimeExpires;
    }

    public double getModifier() {
        return modifier;
    }

    public void setModifier(double modifier) {
        this.modifier = modifier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public void invalidate() {
        valid = false;
    }

    @Override
    public String toString() {
        return name;
    }
}
