package logic;

import java.util.ArrayList;

public class AccountRegistry extends ArrayList<Account> {

    public AccountRegistry() {
        this.add(new Account("Callum", "0", 10.0, 1234, 2345, 678945));
        this.add(new Account("Chris", "1", 15.0, 1234, 2345, 678945));
        this.add(new Account("Peter", "2", 20.0, 1234, 2345, 678945));
        this.add(new Account("Luke", "3", 25.0, 1234, 2345, 678945));
        this.add(new Account("Jamie", "4", 30.0, 1234, 2345, 678945));
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