package logic.fare;

import logic.location.Location;
import org.junit.Test;
import junit.framework.TestCase;

public class DistanceFareTest extends TestCase{

    private DistanceFare distanceFare;

    @Test
    public void testCheckDistanceFareGetsCreated() {
        this.distanceFare = new DistanceFare();

        assertNotNull(distanceFare);
    }

    @Test
    public void testCheckDistanceFareSize() {
        this.distanceFare = new DistanceFare();

        assertEquals(this.distanceFare.getTrips().size(), 6);
    }

    @Test
    public void testCheckForValidLocations() {
        this.distanceFare = new DistanceFare();

        for (Trip trip: distanceFare.trips) {
            if(trip.getStart().getId() != "") {
                assertTrue(true);
            } else {
                assertTrue(false);
            }
        }
    }

    @Test
    public void testCheckFirstTripIsValid() {
        this.distanceFare = new DistanceFare();

        assertEquals(distanceFare.trips.firstElement(), new Trip.TripBuilder().setStartLocation(new Location("0")).setEndLocation(new Location("1")).setPrice(5.0).build());
    }
}
