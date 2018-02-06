package logic;

import java.time.LocalDateTime;

public class Account {

    private String name;
    private String id;
    private double credits;

    public Account(String name, String id, double credits) {
        this.name = name;
        this.id = id;
        this.credits = credits;
    }

    public String getId() {
        return id;
    }

    public void processPassengerExit(Location location, LocalDateTime dateTime) {

    }
}
