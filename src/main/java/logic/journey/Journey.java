package logic.journey;

import logic.location.Location;

import java.time.LocalDateTime;

public class Journey {

    private LocalDateTime startDateTime;
    private LocalDateTime endDateTime;
    private double distance;
    private Location startLocation;
    private Location endLocation;

    public Journey() {

    }

    public Journey(LocalDateTime startDateTime, Location startLocation, LocalDateTime endDateTime, Location endLocation, double distance) {
        this.startDateTime = startDateTime;
        this.startLocation = startLocation;
        this.endDateTime = endDateTime;
        this.endLocation = endLocation;
        this.distance = distance;
    }

    public Journey(LocalDateTime startDateTime, Location startLocation) {
        this.startDateTime = startDateTime;
        this.startLocation = startLocation;
    }

    public Location getStartLocation() {
        return startLocation;
    }

    public Location getEndLocation() {
        return endLocation;
    }

    public LocalDateTime getEndDateTime() {
        return endDateTime;
    }

    public LocalDateTime getStartDateTime() { return startDateTime; }

    public Boolean isOpen() {
        return (endDateTime == null && endLocation == null);
    }

    public void closeJourney(LocalDateTime endDateTime, Location endLocation) {
        this.endDateTime = endDateTime;
        this.endLocation = endLocation;
        distance = 100.0;
    }

    @Override
    public String toString() {
        return "Journey{" +
                "startDateTime=" + startDateTime +
                ", endDateTime=" + endDateTime +
                ", distance=" + distance +
                ", startLocation=" + startLocation +
                ", endLocation=" + endLocation +
                '}';
    }

}
