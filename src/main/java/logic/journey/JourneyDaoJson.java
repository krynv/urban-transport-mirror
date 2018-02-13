package logic.journey;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JourneyDaoJson implements JourneyDao {

    private static final String fileName = ".\\src\\main\\resources\\journey.json";

    List<Journey> journeys;

    public JourneyDaoJson() {
        journeys = new ArrayList<Journey>();
    }

    public List<Journey> getJourneysByAccountId(String accountId) {
        return journeys;
    }

    public void setJourneysByAccountId(String accountId, List<Journey> journeys) {
        ObjectMapper objectMapper = new ObjectMapper();

        JourneyRegistrySerializer journeyHistorySerializer = new JourneyRegistrySerializer();
        journeyHistorySerializer.setAccountId(accountId);

        SimpleModule simpleModule = new SimpleModule();
        simpleModule.addSerializer(JourneyRegistry.class, journeyHistorySerializer);
        objectMapper.registerModule(simpleModule);

        File file = new File(fileName);

        try {
            objectMapper.writeValue(file, journeys);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
