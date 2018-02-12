package logic.token;

import logic.token.Token;

import java.util.ArrayList;

public class TokenRegistry extends ArrayList<Token> {

    public TokenRegistry() {
        this.add(new Token("0", "0"));
        this.add(new Token("1", "1"));
        this.add(new Token("2", "2"));
        this.add(new Token("3", "3"));
        this.add(new Token("4", "4"));
    }

    public Token getTokenById(String tokenId) {
        for(Token token: this) {
            if (token.getId().equals(tokenId)) {
                return token;
            }
        }
        return null;
    }

}
