package logic.journey;

import logic.location.Location;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class JourneyHistory {

    private JourneyDaoJson journeyDaoJson;
    private List<Journey> journeys;

    public JourneyHistory(String id) {
        journeyDaoJson = new JourneyDaoJson();
        journeys = journeyDaoJson.getJourneysByAccountId(id);

        journeys.add(new Journey(LocalDateTime.now(), new Location("0")));
        journeys.add(new Journey(LocalDateTime.now(), new Location("1")));

        journeyDaoJson.setJourneysByAccountId(id, journeys);
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

                for (int i=1; i < openJourneys.size(); i++) {
                    if (journey.getDepartureDateTime().isBefore(openJourneys.get(i).getDepartureDateTime())) {
                        journey = openJourneys.get(i);
                    }
                }

                return journey;
            }
        }
    }

}
