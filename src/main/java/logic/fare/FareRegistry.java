package logic.fare;

import logic.account.Account;
import logic.journey.Journey;
import logic.route.Route;
import logic.route.RouteRegistry;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class FareRegistry {

    static List<Fare> fares = new ArrayList<Fare>() {{
        add(new DistanceFare());
    }};

    /**
     * Traverse through the appropriate fares in the system.
     * Calculate the cost of the journey dependent on each fare.
     * Compare the costs of each fare.
     * Return the highest cost.
     *
     * @param journey the journey that has just been closed
     * @return the highest cost of the journey from the fares
     */
    public double calculateCost(Journey journey) {
        // TODO: Implement one to two more fares to calculate the maximum fare cost
        double cost = 0.0;

        for (Fare fare:fares) {
            double fareCost = fare.calculateCost(journey);

            if (fareCost > cost) {
                cost = fareCost;
            }
        }

        return cost;
    }

    /**
     * Traverse through the appropriate tariffs for the conditions provided.
     * Calculate the cost of the tariff dependent of each tariff in the system.
     * Compare the costs of each of the tariffs.
     * Return the lowest cost.
     *
     * @param account the account used to calculate the tariff
     * @return the lowest cost for the journey from the tariffs
     */
    public double findCheapestTariff(Account account) {
        return 0.0;
    }

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
