package logic.journey;

import logic.location.Location;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class JourneyRegistry {

    private List<Journey> journeys;

    public JourneyRegistry() {
        journeys = new ArrayList<>();
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

    public void setOpenJourney(Location location, LocalDateTime localDateTime) {
        journeys.add(new Journey(localDateTime, location));
    }

    public List<Journey> getJourneys() {
        return journeys;
    }

    public void addJourney(Journey journey) {
        journeys.add(journey);
    }

    public Journey getLatestJourney() {
        return journeys.get(journeys.size() - 1);
    }
}
