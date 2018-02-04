import jdk.vm.ci.meta.Local;

import java.time.LocalDateTime;

public class FaresStructures {
    private double calculatedJourneyCost;
    private double spentToday;

    public FaresStructures() {

    }

    public void tallyEstSpendToday(double spentToday, double journeyCost) {

    }


    //TODO: Changed to start & end instead of the stuff in the class/ sequence diagram
    public double getRouteCost(RouteRegistry routeRegistry, LocalDateTime start, LocalDateTime end) {

        Tariffs tariffs = new Tariffs();

        for (Route aRoute:routeRegistry) {
            tariffs.calculateRouteCost(aRoute, start, end);
        }



        return 0.0;
    }
}
