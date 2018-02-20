package logic.fare;

import logic.journey.Journey;
import logic.location.Location;
import logic.location.LocationRegistry;
import logic.route.Route;

import java.time.LocalDateTime;
import java.util.Vector;

public class DistanceFare extends Fare {

    static Vector<Trip> trips = new Vector<Trip>();

    class Trip {
        private Location start;
        private Location end;
        private double price;

        Trip(Location start, Location end, double price) {
            this.start = start;
            this.end = end;
            this.price = price;
        }

        public Location getStart() {
            return start;
        }

        public Location getEnd() {
            return end;
        }

        public double getPrice() {
            return price;
        }
    }

    public DistanceFare() {
        super();

        trips.add(new Trip(new Location("0"), new Location("1"), 5.0));
        trips.add(new Trip(new Location("0"), new Location("2"), 7.5));
        trips.add(new Trip(new Location("1"), new Location("2"), 4.5));
        trips.add(new Trip(new Location("0"), new Location("3"), 6.5));
        trips.add(new Trip(new Location("3"), new Location("4"), 8.0));
        trips.add(new Trip(new Location("4"), new Location("1"), 9.5));
    }

    public double calculateCost(Journey journey) {
        // TODO: Implement logic for calculate cost
        return 0.0;
    }

    public double calculateRouteCost(Route route, LocalDateTime start, LocalDateTime end) {
        double cost = 0.0;

        Location startLocation = route.getStartLocation();
        LocationRegistry locationRegistry = route.getDestinationLocations().tail();

        for (Location location: locationRegistry) {
            for (DistanceFare.Trip trip: trips) {
                if (startLocation.getId().equals(trip.getStart().getId()) && location.getId().equals(trip.getEnd().getId())) {
                    cost += trip.getPrice();
                    startLocation = location;
                }
            }
        }

        return cost;
    }

}
