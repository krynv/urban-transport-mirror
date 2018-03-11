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

    /**
     *
     * @return LocalDateTime value of the Journey's arrival
     */
    public LocalDateTime getArrivalDateTime() {
        return arrivalDateTime;
    }

    /**
     *
     * @param arrivalDateTime - LocalDateTime value for setting the Journey's arrival time
     */
    public void setArrivalDateTime(LocalDateTime arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    /**
     *
     * @return LocalDateTime value of the Journey's departure
     */
    public LocalDateTime getDepartureDateTime() {
        return departureDateTime;
    }

    /**
     *
     * @param departureDateTime - LocalDateTime value for setting the Journey's departure time
     */
    public void setDepartureDateTime(LocalDateTime departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    public double getDistance() {
        return distance;
    }

    /**
     *
     * @param distance - double value for setting the Journey's distance
     */
    public void setDistance(double distance) {
        this.distance = distance;
    }

    /**
     *
     * @return Location value of the Journey's arrival
     */
    public Location getArrivalLocation() {
        return arrivalLocation;
    }

    /**
     *
     * @param arrivalLocation - Location value for setting the Journey's arrival location
     */
    public void setArrivalLocation(Location arrivalLocation) {
        this.arrivalLocation = arrivalLocation;
    }

    /**
     *
     * @return Location value of the Journey's departure
     */
    public Location getDepartureLocation() {
        return departureLocation;
    }

    /**
     *
     * @param departureLocation - Location value for setting the Journey's departure location
     */
    public void setDepartureLocation(Location departureLocation) {
        this.departureLocation = departureLocation;
    }

    /**
     * Closing a journey by setting it's
     * LocalDateTime of arrival and Location to:
     * @param endLocation - given Location value
     * @param endDateTime - given LocalDateTime value
     */
    public void closeJourney(Location endLocation, LocalDateTime endDateTime) {
        this.arrivalDateTime = endDateTime;
        this.arrivalLocation = endLocation;
        distance = 100.0;
    }

    /**
     * Returns a boolean value for whether the journey is open
     * by checking whether the values of arrivalDateTime
     * and ArrivalLocations have been set
     * @return boolean
     */
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
