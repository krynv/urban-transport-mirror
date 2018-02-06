package logic;

import java.util.ArrayList;

public class AccountRegistery extends ArrayList<Account> {

    public AccountRegistery() {
        this.add(new Account("Callum", "0"));
        this.add(new Account("Chris", "1"));
        this.add(new Account("Peter", "2"));
        this.add(new Account("Luke", "3"));
        this.add(new Account("Jamie", "4"));
    }

    public Account getAccount(String accountId) {
        for(Account account: this) {
            if (account.getId().equals(accountId)) {
                return account;
            }
        }
        return null;
    }

}
