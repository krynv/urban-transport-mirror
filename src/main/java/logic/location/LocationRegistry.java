package logic.location;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class LocationRegistry {

    private LocationDaoJson locationDaoJson;
    private List<Location> locations;

    public LocationRegistry() {
        locationDaoJson = new LocationDaoJson();
        locations = locationDaoJson.getLocations();
    }

    public LocationRegistry(List<Location> locations) {
        this.locations = locations;
    }

    public void addLocation(Location location) {
        locations.add(location);
    }

    public Location getLocationById(String id) {
        for(Location location: locations) {
            if (location.getId().equals(id)) {
                return location;
            }
        }
        return null;
    }

    public List<Location> getLocations() {
        return locations;
    }

    public LocationRegistry tail() {
        LocationRegistry locationRegistry = new LocationRegistry(locations);

        if (locationRegistry.getLocations().size() > 1) {
            locationRegistry.getLocations().remove(0);
            return locationRegistry;
        } else {
            return locationRegistry;
        }
    }

}