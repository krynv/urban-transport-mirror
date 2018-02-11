package logic;

public class Location {

    private String id;

    public Location(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Location{" +
                "id='" + id + '\'' +
                '}';
    }

}
