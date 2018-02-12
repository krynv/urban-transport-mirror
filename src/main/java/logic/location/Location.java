package logic.location;

public class Location {

    private String id;

    public Location(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Location{" +
                "id='" + id + '\'' +
                '}';
    }

}
