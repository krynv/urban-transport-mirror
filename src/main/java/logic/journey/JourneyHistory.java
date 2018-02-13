package logic.journey;

import logic.location.Location;

import java.time.LocalDateTime;
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

    public Journey findOpenJourney() {
        for(Journey journey: journeys) {
            if (journey.isOpen()) {
                return journey;
            }
        }
        return null;
    }

}
