package logic.account;

import java.util.List;

public interface AccountDao {

    List<Account> getAccounts();
    void setAccounts(List<Account> accounts);
}
