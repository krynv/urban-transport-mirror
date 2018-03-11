package logic.fare;

import logic.journey.Journey;
import logic.location.Location;
import logic.location.LocationRegistry;
import logic.route.Route;

import java.time.LocalDateTime;
import java.util.Vector;

public class DistanceFare extends Fare {

    static Vector<Trip> trips = new Vector<Trip>();

    public DistanceFare() {
        super();

        trips.add(new Trip.TripBuilder().setStartLocation(new Location("0")).setEndLocation(new Location("1")).setPrice(5.0).build());
        trips.add(new Trip.TripBuilder().setStartLocation(new Location("0")).setEndLocation(new Location("2")).setPrice(7.5).build());
        trips.add(new Trip.TripBuilder().setStartLocation(new Location("1")).setEndLocation(new Location("0")).setPrice(4.5).build());
        trips.add(new Trip.TripBuilder().setStartLocation(new Location("1")).setEndLocation(new Location("2")).setPrice(6.5).build());
        trips.add(new Trip.TripBuilder().setStartLocation(new Location("2")).setEndLocation(new Location("0")).setPrice(8.0).build());
        trips.add(new Trip.TripBuilder().setStartLocation(new Location("2")).setEndLocation(new Location("1")).setPrice(9.5).build());
    }

    public double calculateCost(Journey journey) {
        for (Trip trip: trips) {
            if (journey.getDepartureLocation().getId().equals(trip.getStart().getId()) &&
                    journey.getArrivalLocation().getId().equals(trip.getEnd().getId())) {
                return trip.getPrice();
            }
        }
        return 0.0;
    }

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

}
