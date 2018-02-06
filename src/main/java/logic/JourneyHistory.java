package logic;

import java.util.ArrayList;

public class JourneyHistory extends ArrayList<Journey> {

    public JourneyHistory() {}

    public Journey findOpenJourney() {
        for(Journey journey: this) {
            if (journey.isOpen()) {
                return journey;
            }
        }
        return null;
    }

}
