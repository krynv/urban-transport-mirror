import java.time.LocalDateTime;

public class Report {

    private String name;
    private int type;
    private LocalDateTime startDateTime;
    private LocalDateTime endDateTime;
//    private Route route;
//    private Printer printer;
//    private Vehicle vehicle;

    public Report() {}

    public Report(String name, int type, LocalDateTime startDateTime, LocalDateTime endDateTime) {
        this.name = name;
        this.type = type;
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
    }

    public String getName() {
        return name;
    }

}
