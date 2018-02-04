public class Route {

    private String routeID;
    private TimeBands timeBands;
    private LocationRegistry destinationLocations;
    private double routeIncome;
    private double routeRunningCosts;
    private double routeMaintenanceCosts;

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

    public float calcDistanceBetweenStops(Location start, Location finish) {

        //var distance = start-finish;

        return 0.0f;
    }
}
