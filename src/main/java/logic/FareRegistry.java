package logic;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class FareRegistry {
    private double calculatedJourneyCost;
    private double spentToday;

    public FareRegistry() {

    }

    static List<Fare> fares = new ArrayList<Fare>() {{
        add(new DistanceFare());
        // add(new OAPFare());
        // add(new OffPeakFare());
        // add(new DurationFare());
        // add(new CreditFare());
    }};

    public double calculateCostOfJourney(Journey journey) {
        return 0.0;
    }


    //TODO: Changed to start & end instead of the stuff in the class/ sequence diagram
    public RouteRegistry getRoutesCost(RouteRegistry routeRegistry, LocalDateTime start, LocalDateTime end) {
        // Get the cost of each of the routes
        // Iterate through each route and set the cost of the route

        Fare fare = fares.get(0);   // DistanceFare

        for (Route aRoute:routeRegistry) {
            aRoute.setCost(fare.calculateRouteCost(aRoute, start, end));
        }

        return routeRegistry;
    }
}
