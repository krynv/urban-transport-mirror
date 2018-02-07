package logic;

import java.util.ArrayList;
import java.util.List;

public class FareRegistry {

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
}
