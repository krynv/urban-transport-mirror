package logic;

public class GateController {

    private TokenRegistry tokenRegistry;
    private AccountRegistry accountRegistry;
    private Token token;
    private Account account;

    public GateController() {
        tokenRegistry = new TokenRegistry();
        accountRegistry = new AccountRegistry();
    }

    public void passTokenId(int tokenId) {
        token = tokenRegistry.getToken(tokenId);
        account = accountRegistry.getAccount(token.getAccountId());
    }

}
