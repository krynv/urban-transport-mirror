package logic.gate;

import logic.account.Account;
import logic.account.AccountRegistry;
import logic.location.Location;
import logic.token.Token;
import logic.token.TokenRegistry;

public class GateController {

    private TokenReader tokenReader;
    private TokenRegistry tokenRegistry;
    private AccountRegistry accountRegistry;

    public GateController() {
        tokenReader = new TokenReader("0", new Location("1"));
        tokenRegistry = new TokenRegistry();
        accountRegistry = new AccountRegistry();
    }

    public void presentToken(String tokenId) {
        tokenReader.setTokenId(tokenId);

        String scannedTokenId = tokenReader.getTokenId();

        Token token = tokenRegistry.getTokenById(scannedTokenId);

        if (token != null) {
            Account account = accountRegistry.getAccountById(token.getAccountId());

            if (account != null) {

            } else {
                System.out.println("Account is null");  // TODO: Change to Logger
            }
        } else {
            System.out.println("Token is null");    // TODO: Change to Logger
        }
    }

}
