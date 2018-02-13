package logic.journey;

import java.util.ArrayList;
import java.util.List;

public class JourneyHistory extends ArrayList<Journey> {

    public JourneyHistory() {}

    public Journey findOpenJourney() { // TODO: Unit test

        List<Journey> openJourneys = new ArrayList<Journey>();

        for(Journey journey: this) {
            if (journey.isOpen()) {
                openJourneys.add(journey);
            }
        }

        if (openJourneys.isEmpty()) {
            return null;
        } else {
            if (openJourneys.size() == 1) {
                return openJourneys.get(0);
            } else {
                Journey journey = openJourneys.get(0);

                for (int i=1; i < openJourneys.size(); i++) {
                    if (journey.getStartDateTime().isBefore(openJourneys.get(i).getStartDateTime())) {
                        journey = openJourneys.get(i);
                    }
                }

                return journey;
            }
        }
    }

}
