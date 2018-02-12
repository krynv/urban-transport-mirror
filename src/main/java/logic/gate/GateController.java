package logic.gate;

import logic.account.Account;
import logic.account.AccountRegistry;
import logic.location.Location;
import logic.token.Token;
import logic.token.TokenRegistry;

import java.time.LocalDateTime;

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

        Token token = tokenRegistry.getTokenById(tokenReader.getTokenId());

        if (token != null) {
            Account account = accountRegistry.getAccountById(token.getAccountId());

            if (account != null) {
                account.processPassengerExit(tokenReader.getLocation(), LocalDateTime.now());
            } else {
                System.out.println("Account is null");  // TODO: Change to Logger
            }
        } else {
            System.out.println("Token is null");    // TODO: Change to Logger
        }
    }

}
