package logic.journey;

import logic.location.Location;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class JourneyRegistry {

    private List<Journey> journeys;

    /**
     *
     */
    public JourneyRegistry() {
        journeys = new ArrayList<>();
    }

    /**
     * Traverse though the list of journeys that belong to the existing JourneyHistory object
     * Check if a journey is open, if so, add it to the list of open journeys
     *
     * Check if the list is empty, return null if true
     *
     * If the list contains one and only one value, return the first value
     * Otherwise,
     * Iterate through the list of journeys that have been added
     * Check if the first journey's departure time is before the departure time of the iterated list item
     * If so, set the returned journey as that value
     * If not, return the first journey in the open journey list
     *
     * @return Journey object that has the status of open journey
     */
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

    /**
     * Add a new open journey to the list of journeys with given parameters of:
     * @param location - departure location
     * @param localDateTime - start journey time
     */
    public void setOpenJourney(Location location, LocalDateTime localDateTime) {
        journeys.add(new Journey(localDateTime, location));
    }

    /**
     *
     * @return journeys belonging to a JourneyRegistry object
     */
    public List<Journey> getJourneys() {
        return journeys;
    }

    /**
     * Add a journey to a JourneyRegistry object
     * @param journey - given Journey object
     * @see Journey
     */
    public void addJourney(Journey journey) {
        journeys.add(journey);
    }

    /**
     * Get the most recent journey
     * @return the last item belonging to the JourneyRegistry object
     */
    public Journey getLatestJourney() {
        return journeys.get(journeys.size() - 1);
    }
}