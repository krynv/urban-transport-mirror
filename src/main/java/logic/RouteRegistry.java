package logic;

import java.time.LocalDateTime;
import java.util.ArrayList; 

// TODO: Removed RouteController class and merged with RouteRegistry
public class RouteRegistry extends ArrayList<Route> {
    public RouteRegistry() {
        super();

        TimeBands timeBands1 = new TimeBands();
        TimeBands timeBands2 = new TimeBands();
        TimeBands timeBands3 = new TimeBands();

        timeBands1.addTimeBand(new TimeBand(1, LocalDateTime.of(2018,2,4,9,0), LocalDateTime.of(2018,2,4,10,0), false));
        timeBands2.addTimeBand(new TimeBand(2, LocalDateTime.of(2018,2,4,10,15), LocalDateTime.of(2018,2,4,11,15), true));
        timeBands3.addTimeBand(new TimeBand(3, LocalDateTime.of(2018,2,4,12,30), LocalDateTime.of(2018,2,4,13,30), true));

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

//        this.add(new Route("1", timeBands1, locationRegistry1));
//        this.add(new Route("2", timeBands2, locationRegistry2));
        this.add(new Route("3", timeBands3, locationRegistry3));
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
                if (aLocation.getLocationID() == arrivingLocation.getLocationID()) {
                    // do something useful
                    returnedRoutes.add(aRoute);
                }
            }
        }

        return returnedRoutes;
    }

}
