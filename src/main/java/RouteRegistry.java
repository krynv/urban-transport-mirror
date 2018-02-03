import java.util.ArrayList;

// TODO: Removed RouteController class and merged with RouteRegistry
public class RouteRegistry extends ArrayList<Route> {
    public RouteRegistry() {
        super();
    }

    public RouteRegistry getRoutesByLotsOfVariables() {
        RouteRegistry routes = new RouteRegistry();

        return routes;
    }

    public RouteRegistry getRoutesByNotSoManyVariables() {
        RouteRegistry routes = new RouteRegistry();

        return routes;
    }

    public RouteRegistry getRoutesByDepartureAndDestinationLocations(Location departingLocation, Location arrivingLocation) {
        RouteRegistry returnedRoutes = new RouteRegistry();

        for(Route aRoute:this) {
            LocationRegistry destinationLocations = aRoute.getDestinationLocations();
            for(Location aLocation: destinationLocations) {
                if(aLocation.getLocationID() == arrivingLocation.getLocationID()){
                    // do something useful
                    returnedRoutes.add(aRoute);
                }
            }
        }

        return returnedRoutes;
    }

}
