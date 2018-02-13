package logic.journey;

import logic.location.Location;

import java.time.LocalDateTime;

public class Journey {

    private LocalDateTime arrivalDateTime;
    private LocalDateTime departureDateTime;
    private double distance;
    private Location arrivalLocation;
    private Location departureLocation;

    public Journey() {}

    public Journey(LocalDateTime arrivalDateTime, Location arrivalLocation, LocalDateTime departureDateTime, Location departureLocation, double distance) {
        this.arrivalDateTime = arrivalDateTime;
        this.arrivalLocation = arrivalLocation;
        this.departureDateTime = departureDateTime;
        this.departureLocation = departureLocation;
        this.distance = distance;
    }

    public Journey(LocalDateTime arrivalDateTime, Location arrivalLocation) {
        this.arrivalDateTime = arrivalDateTime;
        this.arrivalLocation = arrivalLocation;
    }

    public LocalDateTime getDepartureDateTime() {
        return departureDateTime;
    }
    
    public Boolean isOpen() {
        return (departureDateTime == null && departureLocation == null);
    }

    public void closeJourney(Location endLocation, LocalDateTime endDateTime) {
        this.departureDateTime = endDateTime;
        this.departureLocation = endLocation;
        distance = 100.0;
    }

    public LocalDateTime getArrivalDateTime() {
        return arrivalDateTime;
    }

    public Location getArrivalLocation() {
        return arrivalLocation;
    }

    @Override
    public String toString() {
        return "Journey{" +
                "arrivalDateTime=" + arrivalDateTime +
                ", departureDateTime=" + departureDateTime +
                ", distance=" + distance +
                ", arrivalLocation=" + arrivalLocation +
                ", departureLocation=" + departureLocation +
                '}';
    }

}
