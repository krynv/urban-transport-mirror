import java.time.LocalDateTime;

public class MaintenanceReport extends Report {

    private int numberOfBreakdowns;

    public MaintenanceReport(String name, int type, LocalDateTime startDateTime, LocalDateTime endDateTime, int numberOfBreakdowns) {
        super(name, type, startDateTime, endDateTime);
        this.numberOfBreakdowns = numberOfBreakdowns;
    }

}
