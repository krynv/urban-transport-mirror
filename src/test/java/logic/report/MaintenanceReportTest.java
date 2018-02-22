package logic.report;

import org.junit.Test;

import java.time.LocalDateTime;

import static junit.framework.TestCase.assertTrue;

public class MaintenanceReportTest {
    private MaintenanceReport report;
    @Test
    public void checkReport() {
        this.report = new MaintenanceReport("1",
                1,
                LocalDateTime.of(2018, 2, 4, 12, 0, 0),
                LocalDateTime.of(2018, 2, 4, 13, 0, 0),
                1);
        if(this.report != null) {
            assertTrue(true);
        } else {
            assertTrue(false);
        }
    }
    @Test
    public void checkMainCost() {
        this.report = new MaintenanceReport("1",
                1,
                LocalDateTime.of(2018, 2, 4, 12, 0, 0),
                LocalDateTime.of(2018, 2, 4, 13, 0, 0),
                1);
        if(this.report.getMaintenanceCost() == 100.0) {
            assertTrue(true);
        } else {
            assertTrue(false);
        }
    }

    @Test
    public void checkBreakCost() {
        this.report = new MaintenanceReport("1",
                1,
                LocalDateTime.of(2018, 2, 4, 12, 0, 0),
                LocalDateTime.of(2018, 2, 4, 13, 0, 0),
                1);
        if(this.report.getBrakedownCost() == 85.0) {
            assertTrue(true);
        } else {
            assertTrue(false);
        }
    }
    @Test
    public void checkMostExpenCost() {
        this.report = new MaintenanceReport("1",
                1,
                LocalDateTime.of(2018, 2, 4, 12, 0, 0),
                LocalDateTime.of(2018, 2, 4, 13, 0, 0),
                1);
        if(this.report.getMostExpensiveVehicle().equals("Vehicle 1")) {
            assertTrue(true);
        } else {
            assertTrue(false);
        }
    }
    @Test
    public void checkCheapestCost() {
        this.report = new MaintenanceReport("1",
                1,
                LocalDateTime.of(2018, 2, 4, 12, 0, 0),
                LocalDateTime.of(2018, 2, 4, 13, 0, 0),
                1);
        if(this.report.getCheapestVehicle().equals("Vehicle 2")) {
            assertTrue(true);
        } else {
            assertTrue(false);
        }
    }
}
