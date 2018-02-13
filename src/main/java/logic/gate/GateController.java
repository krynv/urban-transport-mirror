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
    private Boolean open;

    public GateController() {
        tokenReader = new TokenReader("0", new Location("1"));
        tokenRegistry = new TokenRegistry();
        accountRegistry = new AccountRegistry();
        open = false;
    }

    public void presentToken(String tokenId) {
        tokenReader.setTokenId(tokenId);

        Token token = tokenRegistry.getTokenById(tokenReader.getTokenId());

        if (token != null) {
            Account account = accountRegistry.getAccountById(token.getAccountId());

            if (account != null) {
                account.processPassengerExit(tokenReader.getLocation(), LocalDateTime.now());

                if (account.canExit()) {
                    open = true;
                } else {
                    System.out.println("User cannot exit");  // TODO: Change to Logger
                }
            } else {
                System.out.println("Account is null");  // TODO: Change to Logger
            }
        } else {
            System.out.println("Token is null");    // TODO: Change to Logger
        }
    }

    public Boolean canOpen() {
        return open;
    }

}
