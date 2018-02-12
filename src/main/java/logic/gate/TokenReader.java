package logic.gate;

import logic.location.Location;

public class TokenReader {

    private String id;
    private Location location;
    private String tokenId;

    public TokenReader(String id, Location location) {
        this.id = id;
        this.location = location;
    }

    public void setTokenId(String tokenId) {
        this.tokenId = tokenId;
    }

    public String getTokenId() {
        return tokenId;
    }

    public Location getLocation() {
        return location;
    }
}
