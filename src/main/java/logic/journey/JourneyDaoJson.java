package logic.journey;

import com.fasterxml.jackson.core.type.TypeReference;
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

    public List<Journey> getJourneys() {
        ObjectMapper objectMapper = new ObjectMapper();

        SimpleModule simpleModule = new SimpleModule("JourneyDeserializer");
        simpleModule.addDeserializer(Journey.class, new JourneyDeserializer());

        objectMapper.registerModule(simpleModule);

        try {
            journeys = objectMapper.readValue(new File(fileName), new TypeReference<List<Journey>>(){});
        } catch (IOException e) {
            e.printStackTrace();
        }

        return journeys;
    }
}
