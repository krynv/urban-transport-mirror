package logic.location;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LocationDaoJson implements LocationDao {

    private static final String fileName = "./src/main/resources/location.json";

    public LocationDaoJson() {}

    public List<Location> getLocations() {
        ObjectMapper objectMapper = new ObjectMapper();

        List<Location> locations = new ArrayList<>();

        try {
            locations = objectMapper.readValue(new File(fileName), new TypeReference<List<Location>>(){});
        } catch (IOException e) {
            e.printStackTrace();
        }

        return locations;
    }
}
