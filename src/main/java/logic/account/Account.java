package logic.account;

import logic.journey.Journey;
import logic.journey.JourneyHistory;
import logic.location.Location;
import logic.pass.Pass;
import logic.pass.PassRegistry;

import java.time.LocalDateTime;

public class Account {

    private String id;
    private String name;
    private JourneyHistory journeyHistory;
    private PassRegistry passes;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    /**
     *
     * @param departureLocation the location the token was scanned at.
     * @param departureDateTime the time the token was scanned at.
     */
    public void processPassengerExit(Location departureLocation, LocalDateTime departureDateTime) {
        Journey openJourney = journeyHistory.findOpenJourney();

        if (openJourney != null) {

        } else {
            System.out.println("Open Journey is null"); // TODO: Change to Logger
        }
    }

}
