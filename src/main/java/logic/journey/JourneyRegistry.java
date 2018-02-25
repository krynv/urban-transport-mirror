package logic.journey;

import logic.location.Location;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class JourneyRegistry {

    private JourneyDaoJson journeyDaoJson;
    private List<Journey> journeys;

    public JourneyRegistry(String id) {
        // TODO: Create JourneySerializer
//        journeyDaoJson = new JourneyDaoJson();
//        journeys = journeyDaoJson.getJourneysByAccountId(id);
//        journeyDaoJson.setJourneysByAccountId(id, journeys);

        journeys = new ArrayList<Journey>();
        journeys.add(new Journey(LocalDateTime.now(), new Location("0")));
    }

    public Journey findOpenJourney() {  // TODO: Create unit test
        List<Journey> openJourneys = new ArrayList<Journey>();

        for(Journey journey: journeys) {
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

                for (int i = 1; i < openJourneys.size() - 1; i++) {
                    if (journey.getDepartureDateTime().isBefore(openJourneys.get(i).getDepartureDateTime())) {
                        journey = openJourneys.get(i);
                    }
                }

                return journey;
            }
        }
    }

}
