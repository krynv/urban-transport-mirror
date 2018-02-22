package logic.location;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class LocationTest {

    private Location location;
    @Test
    public void checkLocation() {
        this.location = new Location("1");
        if(this.location != null) {
            assertTrue(true);
        } else {
            assertTrue(false);
        }
    }
    @Test
    public void checkLocationId() {
        this.location = new Location("1");
        if(this.location.getId().equals("1")) {
            assertTrue(true);
        } else {
            assertTrue(false);
        }
    }
}
