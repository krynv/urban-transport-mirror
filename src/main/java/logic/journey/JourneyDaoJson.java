package logic.journey;

import java.util.ArrayList;
import java.util.List;

public class JourneyDaoJson implements JourneyDao {

    private static final String fileName = "./src/main/resources/journey.json";

    List<Journey> journeys;

    public JourneyDaoJson() {
        journeys = new ArrayList<>();
    }

    public List<Journey> getJourneysByAccountId(String accountId) {
        return journeys;
    }

    public void setJourneysByAccountId(String accountId, List<Journey> journeys) {

    }

}
