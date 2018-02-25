package logic.account;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AccountDaoJson implements AccountDao {

    private static final String fileName = "./src/main/resources/account.json";

    List<Account> accounts;

    public AccountDaoJson() {
        accounts = new ArrayList<>();
    }

    public List<Account> getAccounts() {
        ObjectMapper objectMapper = new ObjectMapper();

        SimpleModule simpleModule = new SimpleModule("AccountDeserializer", new Version(1, 0, 0, null, null, null));
        simpleModule.addDeserializer(Account.class, new AccountDeserializer());

        objectMapper.registerModule(simpleModule);

        try {
            accounts = objectMapper.readValue(new File(fileName), new TypeReference<List<Account>>(){});
        } catch (IOException e) {
            e.printStackTrace();
        }

        return accounts;
    }
}
