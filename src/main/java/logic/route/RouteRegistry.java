package logic.route;


import logic.location.Location;
import logic.location.LocationRegistry;
import logic.timeband.TimeBand;
import logic.timeband.TimeRegistry;

import java.time.LocalDateTime;
import java.util.ArrayList; 

// TODO: Removed RouteController class and merged with RouteRegistry
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

    public RouteRegistry getRoutes(Location departingLocation, Location arrivingLocation, LocalDateTime start, LocalDateTime end) {
        RouteRegistry routes = new RouteRegistry();

        return routes;
    }

    public RouteRegistry getRoutesByNotSoManyVariables() {
        RouteRegistry routes = new RouteRegistry();

        return routes;
    }

    public RouteRegistry getRoutesByDepartureAndDestinationLocations(Location departingLocation, Location arrivingLocation) {
        RouteRegistry returnedRoutes = new RouteRegistry();

        for (Route aRoute:this) {
            LocationRegistry destinationLocations = aRoute.getDestinationLocations();
            for (Location aLocation: destinationLocations) {
                if (aLocation.getId() == arrivingLocation.getId()) {
                    // do something useful
                    returnedRoutes.add(aRoute);
                }
            }
        }

        return returnedRoutes;
    }
}
