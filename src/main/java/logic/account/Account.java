package logic.account;

import logic.fare.FareRegistry;
import logic.journey.Journey;
import logic.journey.JourneyRegistry;
import logic.location.Location;
import logic.pass.Pass;

import java.time.LocalDateTime;

public class Account {

    private String id;
    private String name;
    private JourneyRegistry journeys;
    private Pass pass; // TODO: Change to pass registry
    private double spentToday;
    private double credits;
    private Boolean exit;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
        this.journeys = new JourneyRegistry(id);
        this.pass = new Pass(true, LocalDateTime.now());
        this.spentToday = 10.0;
        this.credits = 100.0;
        this.exit = false;
    }

    /**
     *
     * @param departureLocation the location the token was scanned at.
     * @param departureDateTime the time the token was scanned at.
     */
    public void processPassengerExit(Location departureLocation, LocalDateTime departureDateTime) {
        Journey openJourney = journeys.findOpenJourney();

        if (openJourney != null) {
            openJourney.closeJourney(departureLocation, departureDateTime);

            if (!pass.isCovered(openJourney)) {
                FareRegistry fares = new FareRegistry();

                spentToday += fares.calculateCost(openJourney); // TODO: Implement logic for calculate cost

                credits -= fares.findCheapestTariff(this);  // TODO: Implement logic for find cheapest tariff

                exit = true;
            } else {
                System.out.println("Pass covers journey"); // TODO: Change to Logger
            }
        } else {
            System.out.println("Open Journey is null"); // TODO: Change to Logger
        }
    }

    public String getId() {
        return id;
    }

    public Boolean canExit() {
        return exit;
    }

}
