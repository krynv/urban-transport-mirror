package logic.pass;

import logic.journey.Journey;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class PassRegistry {

    private List<Pass> passes;

    public PassRegistry() {
        passes = new ArrayList<>();
    }

    /**
     * Checks that journey is covered through the pass class
     *
     * @param journey the journey that has been selected to check if it has been covered
     * @return if the journey is covered then return true if it isn't return false
     */
    public Boolean isCovered(Journey journey) {
        for (Pass pass: passes) {
            if (pass.isCovered(journey)) {
                return true;
            }
        }

        return false;
    }

    /**
     * Applies the pass to the user if the user is under 25 and over 60
     * returns the total cost based on the reduction of the pass
     *
     * @param totalCost total cost of the journey so far before checking for passes
     * @return the new total cost based on if the use has a pass
     */
    public double applyPass(double totalCost) {
        for (Pass pass: passes) {
            if (pass.isValid()) {
                if (pass.getClass() == StudentPass.class) {
                    totalCost *= pass.getModifier();
                }

                if (pass.getClass() == DayPass.class) {
                    totalCost = pass.getModifier();
                    pass.invalidate();
                }

                if (pass.getClass() == OAPPass.class) {
                    totalCost *= pass.getModifier();
                }
            }
        }

        return totalCost;
    }

    /**
     * gets the day pass if it valid if not returns null
     *
     * @return checks the day pass is valid and if it is returns day pass
     */
    public DayPass getDayPass() {
        for (Pass pass: passes) {
            if (pass.getClass() == DayPass.class && pass.isValid()) {
                return (DayPass) pass;
            }
        }

        return null;
    }

    /**
     * Awards day pass if spent over £15
     */
    public void awardDayPass() {
        passes.add(new DayPass(true, LocalDateTime.of(2018, 12, 25, 12, 0), 15.0, "DayPass"));
    }

    public List<Pass> getPasses() {
        return passes;
    }

    public void addPass(Pass pass) {
        passes.add(pass);
    }

    @Override
    public String toString() {
        return "" + passes;
    }
}
