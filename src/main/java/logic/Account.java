package logic;

import java.time.LocalDateTime;

public class Account {

    private String name;
    private String id;
    private double credits;
    private JourneyHistory journeyHistory;
    private Journey openJourney;
    private PassRegistry passes;
    private double spentToday;

    public Account(String name, String id, double credits) {
        this.name = name;
        this.id = id;
        this.credits = credits;
        this.spentToday = 10.0;

        this.journeyHistory = new JourneyHistory();
        this.passes = new PassRegistry();

        journeyHistory.add(new Journey(LocalDateTime.of(2018, 1, 1, 12, 0), new Location("0"), LocalDateTime.of(2018, 1, 1, 13, 0), new Location("1"), 100));
        journeyHistory.add(new Journey(LocalDateTime.of(2018, 2, 4, 11, 30), new Location("1"), LocalDateTime.of(2018, 2, 4, 14, 0), new Location("0"), 150));
        journeyHistory.add(new Journey(LocalDateTime.of(2018, 2, 6, 12, 0), new Location("0")));

        passes.add(new Pass(false, LocalDateTime.of(2017, 12, 12, 12, 0)));
        passes.add(new Pass(false, LocalDateTime.of(2017, 12, 24, 12, 0)));
        passes.add(new Pass(true, LocalDateTime.of(2017, 12, 12, 12, 0)));
    }

    public String getId() {
        return id;
    }

    public void processPassengerExit(Location endLocation, LocalDateTime endDateTime) {
        // Find an open journey, an open journey does not have an endDateTime, endLocation, or distance travelled
        openJourney = journeyHistory.findOpenJourney();
        // Close an open journey, set the open journey to have an endDateTime, endLocation and distance travelled
        openJourney.closeJourney(endDateTime, endLocation);

        if (passes.isCoveredJourney(openJourney)) {
            System.out.println("Covered");
        }
        else {
            System.out.println("Not Covered");

            FareRegistry fares = new FareRegistry();

            double journeyCost = fares.calculateCostOfJourney(openJourney);

            spentToday += journeyCost;


        }
    }

}