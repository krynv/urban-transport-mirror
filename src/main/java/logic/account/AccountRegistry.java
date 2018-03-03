package logic.account;

import java.util.List;

public class AccountRegistry {

    private AccountDaoJson accountDaoJson;
    private List<Account> accounts;

    public AccountRegistry() {
        accountDaoJson = new AccountDaoJson();
        accounts = accountDaoJson.getAccounts();
    }

    public Account getAccountById(String id) {
        for(Account account: accounts) {
            if (account.getId().equals(id)) {
                return account;
            }
        }
        return null;
    }

    public void setAccount(Account account) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getId().equals(account.getId())) {
                accounts.set(i, account);
            }
        }
    }

    public void saveAccounts() {
        accountDaoJson.setAccounts(accounts);
    }

}
