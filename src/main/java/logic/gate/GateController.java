package logic.gate;

import logic.account.Account;
import logic.account.AccountRegistry;
import logic.location.Location;
import logic.location.LocationRegistry;
import logic.token.Token;
import logic.token.TokenRegistry;

import java.time.LocalDateTime;

public class GateController {

    private TokenReader tokenReader;
    private TokenRegistry tokenRegistry;
    private AccountRegistry accountRegistry;
    private LocationRegistry locationRegistry;
    private Boolean open;
    private Account account;

    public GateController() {
        tokenReader = new TokenReader("0", new Location("0"));

        tokenRegistry = new TokenRegistry();
        accountRegistry = new AccountRegistry();
        locationRegistry = new LocationRegistry();

        open = false;
    }

    public void presentToken(String type, String tokenId, String locationId) {
        tokenReader.setTokenId(tokenId);

        Token token = tokenRegistry.getTokenById(tokenReader.getTokenId());

        if (token != null) {
            account = accountRegistry.getAccountById(token.getAccountId());

            if (account != null) {

                if (type.equals("Entry")) {
                    account.processPassengerEntry(locationRegistry.getLocationById(locationId), LocalDateTime.now());
                    open = true;
                } else {
                    account.processPassengerExit(locationRegistry.getLocationById(locationId), LocalDateTime.now());
                    accountRegistry.setAccount(account);
                    accountRegistry.saveAccounts();
                    open = true;
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

    public Account getAccount() {
        return account;
    }

}
