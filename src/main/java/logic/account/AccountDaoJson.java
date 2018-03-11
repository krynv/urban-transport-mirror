package logic.account;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AccountDaoJson implements AccountDao {

    private static final String fileName = "./src/main/resources/account.json";

    public AccountDaoJson() {}

    /**
     * Read contents from JSON file
     * Deserialize each account from JSON to POJO
     *
     * @return list of all accounts
     */
    public List<Account> getAccounts() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.findAndRegisterModules();

        List<Account> accounts = new ArrayList<>();

        try {
            accounts = objectMapper.readValue(new File(fileName), new TypeReference<List<Account>>(){});
        } catch (IOException e) {
            e.printStackTrace();
        }

        return accounts;
    }

    /**
     *  Write POJO to JSON file
     *  Serialize each account from POJO to JSON
     *
     * @param accounts list of all accounts
     */
    public void setAccounts(List<Account> accounts) {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File(fileName), accounts);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
