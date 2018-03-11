package logic.route;

import logic.location.Location;
import logic.location.LocationRegistry;
import logic.timeband.TimeBand;
import logic.timeband.TimeRegistry;

import java.time.LocalDateTime;
import java.util.ArrayList; 

public class RouteRegistry extends ArrayList<Route> {

    public RouteRegistry() {
        super();

        TimeRegistry timeRegistry1 = new TimeRegistry();
        TimeRegistry timeRegistry2 = new TimeRegistry();
        TimeRegistry timeRegistry3 = new TimeRegistry();

        timeRegistry1.addTimeBand(new TimeBand(1, LocalDateTime.of(2018,2,4,9,0), LocalDateTime.of(2018,2,4,10,0), false));
        timeRegistry2.addTimeBand(new TimeBand(2, LocalDateTime.of(2018,2,4,10,15), LocalDateTime.of(2018,2,4,11,15), true));
        timeRegistry3.addTimeBand(new TimeBand(3, LocalDateTime.of(2018,2,4,12,30), LocalDateTime.of(2018,2,4,13,30), true));

        LocationRegistry locationRegistry1 = new LocationRegistry();
        LocationRegistry locationRegistry2 = new LocationRegistry();
        LocationRegistry locationRegistry3 = new LocationRegistry();

        // Sheffield to London
        locationRegistry1.addLocation(new Location("0"));
        locationRegistry1.addLocation(new Location("1"));

        // Sheffield to London via Derby
        locationRegistry2.addLocation(new Location("0"));
        locationRegistry2.addLocation(new Location("2"));
        locationRegistry2.addLocation(new Location("1"));

        // Sheffield to London via Nottingham and Leicester
        locationRegistry3.addLocation(new Location("0"));
        locationRegistry3.addLocation(new Location("3"));
        locationRegistry3.addLocation(new Location("4"));
        locationRegistry3.addLocation(new Location("1"));

        this.add(new Route("1", timeRegistry1, locationRegistry1));
        this.add(new Route("2", timeRegistry2, locationRegistry2));
        this.add(new Route("3", timeRegistry3, locationRegistry3));
    }

    /**
     * Traverse a list of routes
     *
     * @param departingLocation start location of the route
     * @param arrivingLocation end location of the route
     * @param start of the route
     * @param end of the route
     * @return a list of Routes
     */
    public RouteRegistry getRoutes(Location departingLocation, Location arrivingLocation, LocalDateTime start, LocalDateTime end) {
        RouteRegistry routes = new RouteRegistry();

        for (Route aRoute:this) {
            aRoute.setLocation(arrivingLocation.getId());
        }

        return routes;
    }

    /**
     * Set details of all routes
     *
     * @param arrivalTime end time of route
     * @param departureTime start time of route
     * @param location end location
     */
    public void setRouteInfo(String arrivalTime, String departureTime, String location) {
        for (Route aRoute:this) {
            aRoute.setArriveTime(arrivalTime);
            aRoute.setDepartTime(departureTime);
            aRoute.setLocation(location);
        }
    }

}


