package logic.account;

import java.util.List;

public class AccountRegistry {

    private AccountDaoJson accountDaoJson;
    private List<Account> accounts;

    public AccountRegistry() {
        accountDaoJson = new AccountDaoJson();
        accounts = accountDaoJson.getAccounts();
//        accounts = accountDaoJson.getJourneys(accounts);
    }

    public Account getAccountById(String id) {
        for(Account account: accounts) {
            if (account.getId().equals(id)) {
                return account;
            }
        }
        return null;
    }

}
