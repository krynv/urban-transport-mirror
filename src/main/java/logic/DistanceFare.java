package logic;

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
    }

    public double calculateCostOfJourney(Journey journey) {
        return 0;
    }

}
