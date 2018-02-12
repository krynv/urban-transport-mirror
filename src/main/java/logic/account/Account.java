package logic.account;

import logic.location.Location;

import java.time.LocalDateTime;

public class Account {

    private String id;
    private String name;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    /**
     *
     * @param departureLocation the location the token was scanned at.
     * @param departureDateTime the time the token was scanned at.
     */
    public void processPassengerExit(Location departureLocation, LocalDateTime departureDateTime) {

    }

}
