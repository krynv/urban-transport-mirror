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

    /**
     * The token is scanned when the user gets to a gate
     * Instance of token is found from a registry of tokens
     * Instance of account is found from the token entered
     *  On entry, create an open journey for the account.
     *  On exit, close an open journey for the account.
     *
     * @param type entry or exit gate
     * @param tokenId id from the scanned token
     * @param locationId id of the location where the token was scanned
     */
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
                System.out.println("Account is null");
            }
        } else {
            System.out.println("Token is null");
        }
    }

    public Boolean canOpen() {
        return open;
    }

    public Account getAccount() {
        return account;
    }

}
