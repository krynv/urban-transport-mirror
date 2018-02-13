package logic.token;

import java.util.List;

public class TokenRegistry {

    private TokenDaoJson tokenDaoJson;
    private List<Token> tokens;

    public TokenRegistry() {
        tokenDaoJson = new TokenDaoJson();
        tokens = tokenDaoJson.getTokens();
    }

    public Token getTokenById(String tokenId) {
        for(Token token: tokens) {
            if (token.getId().equals(tokenId)) {
                return token;
            }
        }
        return null;
    }

}
