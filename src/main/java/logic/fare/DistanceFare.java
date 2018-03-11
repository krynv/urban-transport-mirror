package logic.fare;

import logic.journey.Journey;
import logic.location.Location;
import logic.location.LocationRegistry;
import logic.route.Route;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Vector;

public class DistanceFare extends Fare {

    static Vector<Trip> trips = new Vector<Trip>();

    /**
     * Class constructor which uses the builder pattern
     * to create a series of trips
     *
     * @see Trip
     */
    public DistanceFare() {
        super();

        trips.add(new Trip.TripBuilder().setStartLocation(new Location("0")).setEndLocation(new Location("1")).setPrice(5.0).build());
        trips.add(new Trip.TripBuilder().setStartLocation(new Location("0")).setEndLocation(new Location("2")).setPrice(7.5).build());
        trips.add(new Trip.TripBuilder().setStartLocation(new Location("1")).setEndLocation(new Location("0")).setPrice(4.5).build());
        trips.add(new Trip.TripBuilder().setStartLocation(new Location("1")).setEndLocation(new Location("2")).setPrice(6.5).build());
        trips.add(new Trip.TripBuilder().setStartLocation(new Location("2")).setEndLocation(new Location("0")).setPrice(8.0).build());
        trips.add(new Trip.TripBuilder().setStartLocation(new Location("2")).setEndLocation(new Location("1")).setPrice(9.5).build());
    }

    /**
     * Traverse through the list of added trips, created in the constructor
     * Check if the given journey departure location ID is equal to that of the trip's start ID
     * AND check is the given journey arrival location ID is equal to that of the trip's end ID
     * If so, return the price that belongs to the trip
     *
     * After traversing, if no ID's were matched then return the price of zero
     *
     * @param journey - given journey for the cost to be calculated for
     * @return double - price that belongs to the trip
     */
    public double calculateCost(Journey journey) {
        for (Trip trip: trips) {
            if (journey.getDepartureLocation().getId().equals(trip.getStart().getId()) &&
                    journey.getArrivalLocation().getId().equals(trip.getEnd().getId())) {
                return trip.getPrice();
            }
        }
        return 0.0;
    }

    /**
     * Traverse through the locations found inside of the location registry of a given route
     * Traverse through the trips within these locations and
     * Check if the start and end location IDs are equal to that of the given route's start and end location IDs
     * If so, get the price of the traversed trip, append it to the return 'cost'
     * Set the start location as that traversed location for the process to continue across all locations in the given route
     * Return final cost
     *
     * @param route - contains all of the locations
     * @return double - cost value that gets calculated based on given route
     */
    public double calculateRouteCost(Route route, LocalDateTime start, LocalDateTime end) {
        double cost = 0.0;

        Location startLocation = route.getStartLocation();
        LocationRegistry locationRegistry = route.getDestinationLocations().tail();

        for (Location location: locationRegistry.getLocations()) {
            for (Trip trip: trips) {
                if (startLocation.getId().equals(trip.getStart().getId()) && location.getId().equals(trip.getEnd().getId())) {
                    cost += trip.getPrice();
                    startLocation = location;
                }
            }
        }

        return cost;
    }

    public List<Trip> getTrips() {
        return trips;
    }

}
