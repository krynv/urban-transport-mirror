package logic;

import java.time.LocalDateTime;

public class Journey {

    private LocalDateTime startDateTime;
    private LocalDateTime endDateTime;
    private double distance;
    private Location startLocation;
    private Location endLocation;

    public Journey(LocalDateTime startDateTime, Location startLocation) {
        this.startDateTime = startDateTime;
        this.startLocation = startLocation;
    }

    public Boolean isOpen() {
        return (endDateTime == null && endLocation == null);
    }

    public void closeJourney(LocalDateTime endDateTime, Location endLocation) {

    }
}
