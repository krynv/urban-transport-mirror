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

    public Journey(LocalDateTime departureDateTime, Location departureLocation) {
        this.departureDateTime = departureDateTime;
        this.departureLocation = departureLocation;
    }

    public Journey(LocalDateTime arrivalDateTime, Location arrivalLocation, LocalDateTime departureDateTime, Location departureLocation, double distance) {
        this.arrivalDateTime = arrivalDateTime;
        this.arrivalLocation = arrivalLocation;
        this.departureDateTime = departureDateTime;
        this.departureLocation = departureLocation;
        this.distance = distance;
    }

    public LocalDateTime getArrivalDateTime() {
        return arrivalDateTime;
    }

    public void setArrivalDateTime(LocalDateTime arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    public LocalDateTime getDepartureDateTime() {
        return departureDateTime;
    }

    public void setDepartureDateTime(LocalDateTime departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public Location getArrivalLocation() {
        return arrivalLocation;
    }

    public void setArrivalLocation(Location arrivalLocation) {
        this.arrivalLocation = arrivalLocation;
    }

    public Location getDepartureLocation() {
        return departureLocation;
    }

    public void setDepartureLocation(Location departureLocation) {
        this.departureLocation = departureLocation;
    }

    public void closeJourney(Location endLocation, LocalDateTime endDateTime) {
        this.arrivalDateTime = endDateTime;
        this.arrivalLocation = endLocation;
        distance = 100.0;
    }

    public Boolean isOpen() {
        return (arrivalDateTime == null && arrivalLocation == null);
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
