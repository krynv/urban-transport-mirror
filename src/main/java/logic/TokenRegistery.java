package logic;

import java.util.ArrayList;

public class TokenRegistery extends ArrayList<Token> {

    public TokenRegistery() {
        this.add(new Token(0, 0, "0"));
        this.add(new Token(1, 0, "1"));
        this.add(new Token(2, 0, "2"));
        this.add(new Token(3, 0, "3"));
        this.add(new Token(4, 0, "4"));
    }

    public Token getToken(int tokenId) {
        for(Token token: this) {
            if (token.getId() == tokenId) {
                return token;
            }
        }
        return null;
    }

}
