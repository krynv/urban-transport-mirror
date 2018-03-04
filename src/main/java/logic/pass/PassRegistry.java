package logic.pass;

import logic.journey.Journey;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class PassRegistry {

    private List<Pass> passes;

    public PassRegistry() {
        passes = new ArrayList<>();

        passes.add(new StudentPass(true, LocalDateTime.of(2019, 1, 1, 12, 0)));
    }

    public Boolean isCovered(Journey journey) {
        for (Pass pass: passes) {
            if (pass.isCovered(journey)) {
                return true;
            }
        }

        return false;
    }

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
            }
        }

        return totalCost;
    }

    public DayPass getDayPass() {
        for (Pass pass: passes) {
            if (pass.getClass() == DayPass.class && pass.isValid()) {
                return (DayPass) pass;
            }
        }

        return null;
    }

    public void awardDayPass() {
        passes.add(new DayPass(true, LocalDateTime.of(2019, 1, 1, 12, 0)));
    }

}
