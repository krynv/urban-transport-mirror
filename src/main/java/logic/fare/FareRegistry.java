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
     * Set tarriffs to a list of three different tarriffs
     */
    static List<Tariff> tariffs = new ArrayList<Tariff>() {{
       add(new NormalPeakTariff());
       add(new OffPeakTariff());
       add(new SuperOffPeakTariff());
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
     * @param journey the journey used to calculate the tariff
     * @return the lowest cost for the journey from the tariffs
     */
    public double findCheapestTariff(double journeyCost, Journey journey) {
        double cost = 0.0;

        for (int i =  0; i < tariffs.size(); i++) {
            double tariffCost = tariffs.get(i).calculateCost(journeyCost, journey.getDepartureDateTime());

            if (i == 0) {
                cost = tariffCost;
            } else {
                if (tariffCost < cost) {
                    cost = tariffCost;
                }
            }
        }

        return cost;
    }

    /**
     * Get the cost of each of the routes
     * Iterate through each route and set the cost of the route
     *
     * @param routeRegistry - to obtain all of the routes for traversal
     * @param start - for calculating the route cost in fare
     * @param end - for calculating the route cost in fare
     * @return the route registry so the UI can display the information
     */
    public RouteRegistry getRoutesCost(RouteRegistry routeRegistry, LocalDateTime start, LocalDateTime end) {

        Fare fare = fares.get(0);

        for (Route aRoute:routeRegistry) {
            aRoute.setCost(fare.calculateRouteCost(aRoute, start, end));
        }

        return routeRegistry;
    }
}