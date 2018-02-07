package logic;

import java.util.ArrayList;

public class PassRegistry extends ArrayList<Pass> {

    public PassRegistry() {}

    public Boolean isCoveredJourney(Journey journey) {
        for(Pass pass: this) {
            if (pass.isCovered(journey)) {
                return true;
            }
        }
        return false;
    }
}
