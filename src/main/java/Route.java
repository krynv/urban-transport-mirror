public class Route {

    private TimeBands timeBands;
    private LocationRegistry destinationLocations;
    private String routeID;
    private double routeIncome;
    private double routeRunningCosts;
    private double routeMaintenanceCosts;

    public Route() {

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
