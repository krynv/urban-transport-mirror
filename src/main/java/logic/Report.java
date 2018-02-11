package logic;

import java.time.LocalDateTime;

public class Report {

    private String name;
    private int type;
    private LocalDateTime startDateTime;
    private LocalDateTime endDateTime;
//    private Route route;
    private PrinterRegistry printerRegistry = new PrinterRegistry();
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

    public boolean print(int printerID) {
        return this.printerRegistry.print(printerID);
    }

    @Override
    public String toString() {
        return "Report{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", startDateTime=" + startDateTime +
                ", endDateTime=" + endDateTime +
                ", brakedown=" +
                '}';
    }
}
