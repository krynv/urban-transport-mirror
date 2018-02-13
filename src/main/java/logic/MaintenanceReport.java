package logic;

import java.time.LocalDateTime;

public class MaintenanceReport extends Report {

    private int numberOfBreakdowns;

    public MaintenanceReport(String name, int type, LocalDateTime startDateTime, LocalDateTime endDateTime, int numberOfBreakdowns) {
        super(name, type, startDateTime, endDateTime);
        this.numberOfBreakdowns = numberOfBreakdowns;
    }

    public double getMaintenanceCost() {
        return 100.0;
    }

    public double getBrakedownCost() {
        return 85.0;
    }

    public String getMostExpensiveVehicle() {
        return "Vehicle 1";
    }

    public String getCheapestVehicle() {
        return "Vehicle 2";
    }

    @Override
    public String toString() {
        return "MaintenanceReport{" +
                "numberOfBreakdowns=" + numberOfBreakdowns +
                '}';
    }
}
