package logic.journey;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;

import java.io.File;
import java.io.IOException;
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
        ObjectMapper objectMapper = new ObjectMapper();

        File file = new File(fileName);

        try {
            // objectMapper.writeValue(file, journeys);
            System.out.println(objectMapper.writeValueAsString(journeys));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
