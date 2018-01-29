import java.util.ArrayList;

public class LocationRegistry extends ArrayList<Location> {

    public LocationRegistry() {
        super();
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
            if (aLocation.getLocationID() == givenLocationID) {
                returnLocationObject = aLocation;
            }
        }

        return returnLocationObject;
    }

}
