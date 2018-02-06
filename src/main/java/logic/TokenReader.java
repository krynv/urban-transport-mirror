package logic;

public class TokenReader {

    private int id;
    private int tokenId;

    public TokenReader(int id) {
        this.id = id;
    }

    public void extractTokenId() {
        tokenId = 0;
    }

    public int getTokenId() {
        return tokenId;
    }

}
