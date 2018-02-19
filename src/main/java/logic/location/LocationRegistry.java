package logic.location;

import logic.location.Location;

import java.util.ArrayList;

public class LocationRegistry extends ArrayList<Location> {

    public LocationRegistry() {
        super();
    }

    public LocationRegistry(LocationRegistry locations) {
        super();

        for (Location location: locations) {
            this.add(location);
        }
    }

    public void addLocation(Location aLocation) {
        super.add(aLocation);
    }

    public void removeLocation(Location givenLocation) {
        super.remove(givenLocation);
    }

    public Location getLocationByID(int givenLocationID) {
        Location returnLocationObject = null;

        for(Location aLocation:this) {
            if (aLocation.getId().equals(givenLocationID)) {
                returnLocationObject = aLocation;
            }
        }

        return returnLocationObject;
    }

    public LocationRegistry tail() {
        LocationRegistry locations = new LocationRegistry(this);

        if (locations.size() > 1) {
            locations.remove(0);
            return locations;
        } else {
            return locations;
        }
    }

}