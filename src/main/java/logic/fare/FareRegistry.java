package logic.fare;

import logic.journey.Journey;

import java.util.Map;
import java.util.HashMap;

public class FareRegistry {

    static Map<String, Fare> fares = new HashMap<String, Fare>() {{
        put("DistanceFare", new DistanceFare());
        // put("DurationFare", new DurationFare());
        // put("CreditFare", new CreditFare());
        // put("OAPFare", new OAPFare());
        // put("OffPeakFare", new OffPeakFare());
    }};

    public double calculateCostOfJourney(Journey journey) {
        return 0.0;
    }

}
