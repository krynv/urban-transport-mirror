package logic.fare;

import logic.location.Location;
import org.junit.Test;
import junit.framework.TestCase;

public class DistanceFareTest extends TestCase {

    @Test
    public void testCheckDistanceFareSize() {
        DistanceFare distanceFare = new DistanceFare();

        assertEquals(distanceFare.getTrips().size(), 18);
    }

    @Test
    public void testCheckDistanceFareGetsCreated() {
        DistanceFare distanceFare = new DistanceFare();

        assertNotNull(distanceFare);
    }


    @Test
    public void testCheckForValidLocations() {
        DistanceFare distanceFare  = new DistanceFare();

        for (Trip trip: distanceFare.getTrips()) {
            assertTrue(trip.getStart().getId() != null && trip.getEnd().getId() != null && trip.getPrice() > 0.0);
        }
    }

    @Test
    public void testCheckFirstTripIsValid() {
        DistanceFare distanceFare = new DistanceFare();

        assertEquals(distanceFare.trips.firstElement().getStart().getId(), "0");
        assertEquals(distanceFare.trips.firstElement().getEnd().getId(), "1");
        assertEquals(distanceFare.trips.firstElement().getPrice(), 5.0);
    }
}
