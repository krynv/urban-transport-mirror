package logic;

public class TokenReader {

    private int id;
    private Location location;
    private int tokenId;

    public TokenReader(int id, Location location) {
        this.id = id;
        this.location = location;
    }

    public void extractTokenId() {
        tokenId = 0;
    }

    public int getTokenId() {
        return tokenId;
    }

}
