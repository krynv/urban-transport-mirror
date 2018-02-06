package logic;

public class GateController {

    private TokenRegistery tokenRegistery;
    private AccountRegistery accountRegistery;
    private Token token;
    private Account account;

    public GateController() {
        tokenRegistery = new TokenRegistery();
        accountRegistery = new AccountRegistery();
    }

    public void passTokenId(int tokenId) {
        token = tokenRegistery.getToken(tokenId);
        account = accountRegistery.getAccount(token.getAccountId());
    }

}
