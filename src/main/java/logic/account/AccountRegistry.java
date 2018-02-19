package logic.account;

import java.util.List;

public class AccountRegistry {

    private AccountDaoJson accountDaoJson;
    private List<Account> accounts;

    public AccountRegistry() {
        accountDaoJson = new AccountDaoJson();
        accounts = accountDaoJson.getAccounts();
    }

    public Account getAccountById(String id) { // TODO: Change a function that has 'getAccount' to getAccountById
        for(Account account: accounts) {
            if (account.getId().equals(id)) {
                return account;
            }
        }
        return null;
    }

}
