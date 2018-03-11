package logic.fare;

import logic.location.Location;

public class Trip {

    private Location start;
    private Location end;
    private double price;

    private Trip(TripBuilder builder) {
        this.start = builder.start;
        this.end = builder.end;
        this.price = builder.price;
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

    public static class TripBuilder {
        private Location start;
        private Location end;
        private double price;

        public TripBuilder() {
            this.start = start;
            this.end = end;
            this.price = price;
        }

        public TripBuilder setStartLocation(Location start) {
            this.start = start;
            return this;
        }

        public TripBuilder setEndLocation(Location end) {
            this.end = end;
            return this;
        }

        public TripBuilder setPrice(double price) {
            this.price = price;
            return this;
        }

        public Trip build() {
            return new Trip(this);
        }
    }
}