package logic.account;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AccountDaoJson implements AccountDao {

    private static final String fileName = "./src/main/resources/account.json";

    List<Account> accounts;

    public AccountDaoJson() {
        accounts = new ArrayList<Account>();
    }

    public List<Account> getAccounts() {
        JSONParser jsonParser = new JSONParser();

        try {
            Object object = jsonParser.parse(new FileReader(fileName));
            JSONArray jsonArray = (JSONArray) object;

            for (int i = 0; i < jsonArray.size(); i++) {
                JSONObject jsonObject = (JSONObject) jsonArray.get(i);
                accounts.add(new Account((String) jsonObject.get("id"), (String) jsonObject.get("name"), (Double) jsonObject.get("credits"), (int) (long) jsonObject.get("sortCode"), (int) (long) jsonObject.get("securityNo"), (int) (long) jsonObject.get("accountNum") ));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return accounts;
    }

}
