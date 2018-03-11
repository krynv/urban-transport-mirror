package logic.route;

import logic.location.Location;
import logic.location.LocationRegistry;
import logic.timeband.TimeRegistry;

public class Route {

    private String routeID;
    private TimeRegistry timeRegistry;
    private LocationRegistry destinationLocations;
    private double routeIncome;
    private double routeRunningCosts;
    private double routeMaintenanceCosts;
    private double cost;
    private String location;
    private String departTime;
    private String arriveTime;

    public Route(String routeID, TimeRegistry timeRegistry, LocationRegistry destinationLocations) {
        this.routeID = routeID;
        this.timeRegistry = timeRegistry;
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

    public void setLocation(String location) {
        if(location.equals("0")) {
            location = "Sheffield";
        } else if (location.equals("1")) {
            location = "London";
        } else if (location.equals("2")) {
            location = "Nottingham";
        } else if (location.equals("3")) {
            location = "Leicester";
        } else if (location.equals("4")) {
            location = "Derby";
        }

        this.location = location;
    }

    public String getDepartTime() {
        return departTime;
    }

    public void setDepartTime(String departTime) {
        this.departTime = departTime;
    }

    public String getArriveTime() {
        return arriveTime;
    }

    public void setArriveTime(String arriveTime) {
        this.arriveTime = arriveTime;
    }

    public String getLocation() {
        return location;
    }

    public float calcDistanceBetweenStops(Location start, Location finish) {

        //var distance = start-finish;

        return 0.0f;
    }

    public Location getStartLocation() {
        return destinationLocations.getLocations().get(0);
    }

    @Override
    public String toString() {
        return "<html>\n" +
                "Destination: " + location + "<br>\n" +
                "Departure Date/Time: " + departTime + "<br>\n" +
                "Arrive Date/Time: " + arriveTime + "<br>\n" +
                "Cost: £" + cost + "\n" +
                "</html>";
    }
}
