package logic.journey;

import junit.framework.TestCase;
import logic.location.Location;

import java.time.LocalDateTime;

public class JourneyRegistryTest extends TestCase {

    public void testFindNoOpenJourneyWhenEmpty() {
        JourneyRegistry journeyRegistry = new JourneyRegistry();

        Journey journey = journeyRegistry.findOpenJourney();

        assertNull(journey);
    }

    public void testFindNoOpenJourneyWhenFinished() {
        JourneyRegistry journeyRegistry = new JourneyRegistry();

        Journey journey1 = new Journey(LocalDateTime.of(2018, 03, 11, 11, 11), new Location("0"), LocalDateTime.of(2017, 3, 11, 11, 11), new Location("1"), 100.00);
        Journey journey2 = new Journey(LocalDateTime.of(2018, 03, 11, 11, 11), new Location("0"), LocalDateTime.of(2017, 3, 11, 11, 11), new Location("1"), 100.00);

        journeyRegistry.addJourney(journey1);
        journeyRegistry.addJourney(journey2);

        Journey journey = journeyRegistry.findOpenJourney();

        assertNull(journey);
    }

    public void testFindOpenJourney() {
        JourneyRegistry journeyRegistry = new JourneyRegistry();

        journeyRegistry.setOpenJourney(new Location("0", "London"), LocalDateTime.of(2018, 3, 11, 10, 0, 0));

        Journey journey = journeyRegistry.findOpenJourney();

        assertNotNull(journey);

        assertEquals(journey.getDistance(), 0.0);
        assertNull(journey.getArrivalLocation());
        assertNull(journey.getArrivalDateTime());

        assertNotNull(journey.getDepartureDateTime());
        assertNotNull(journey.getDepartureLocation());
        assertEquals(journey.getDepartureLocation().getId(), "0");
        assertEquals(journey.getDepartureLocation().getName(), "London");
        assertTrue(journey.getDepartureDateTime().isEqual(LocalDateTime.of(2018, 3, 11, 10, 0, 0)));
    }

    public void testFindOldestOpenJourney() {
        JourneyRegistry journeyRegistry = new JourneyRegistry();

        Journey journey1 = new Journey(LocalDateTime.of(2018, 03, 9, 11, 11), new Location("0"));
        Journey journey2 = new Journey(LocalDateTime.of(2018, 03, 10, 11, 11), new Location("1"));

        journeyRegistry.addJourney(journey1);
        journeyRegistry.addJourney(journey2);

        Journey journey = journeyRegistry.findOpenJourney();

        assertNotNull(journey);

        assertEquals(journey.getDistance(), 0.0);
        assertNull(journey.getArrivalLocation());
        assertNull(journey.getArrivalDateTime());

        assertNotNull(journey.getDepartureDateTime());
        assertNotNull(journey.getDepartureLocation());
        assertEquals(journey.getDepartureLocation().getId(), "0");
        assertTrue(journey.getDepartureDateTime().isEqual(LocalDateTime.of(2018, 3, 9, 11, 11, 0)));
    }
}
