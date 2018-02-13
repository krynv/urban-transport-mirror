package logic.journey;

import java.util.List;

public interface JourneyDao {

    List<Journey> getJourneysByAccountId(String accountId);
    void setJourneysByAccountId(String accountId, List<Journey> journeys);

}
