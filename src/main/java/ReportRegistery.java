import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ReportRegistery {

    private List<Report> reports = new ArrayList<Report>();

    public ReportRegistery() {
        reports.add(new MaintenanceReport(
                "maintenance",
                1,
                LocalDateTime.of(2018, 2, 4, 12, 0, 0),
                LocalDateTime.of(2018, 2, 4, 13, 0, 0),
                1));
    }

    public Report getReport(String name, LocalDateTime start, LocalDateTime end) {
        Report report = null;

        for (Report r: reports) {
            if (name.equals(r.getName())) {
                return r;
            }
        }

        return report;
    }

}
