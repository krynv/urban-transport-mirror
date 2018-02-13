package logic;

public class Route {

    private String routeID;
    private TimeBands timeBands;
    private LocationRegistry destinationLocations;
    private double routeIncome;
    private double routeRunningCosts;
    private double routeMaintenanceCosts;
    private double cost;

    public Route(String routeID, TimeBands timeBands, LocationRegistry destinationLocations) {
        this.routeID = routeID;
        this.timeBands = timeBands;
        this.destinationLocations = destinationLocations;
    }

    public double getCostOfRunning() {
        return routeRunningCosts;
    }

    public double getCostOfMaintenance() {
        return routeMaintenanceCosts;
    }

    public LocationRegistry getDestinationLocations() {
        return destinationLocations;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    public float calcDistanceBetweenStops(Location start, Location finish) {

        //var distance = start-finish;

        return 0.0f;
    }

    public Location getStartLocation() {
        return destinationLocations.get(0);
    }

    @Override
    public String toString() {
        return "<html>\n" +
                "Destination <br>\n" +
                "Departure Date/Time <br>\n" +
                "Return Date/Time <br>\n" +
                "£" + cost + "\n" +
                "</html>";
    }
}
