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

                String barry = (String) jsonObject.get("credits");
                double barry2 = Double.parseDouble(barry);

//                String id = (String) jsonObject.get("id");
//                String name = (String) jsonObject.get("name");
//                double credits = Double.parseDouble((String) jsonObject.get("credits"));
//                int sortCode = Integer.parseInt((String) jsonObject.get("sortCode"));
//                int securityNo = Integer.parseInt((String) jsonObject.get("securityNo"));
//                int accountNum = Integer.parseInt((String) jsonObject.get("accountNum"));

                //accounts.add(new Account((String) jsonObject.get("id"), (String) jsonObject.get("name"), Double.parseDouble((String) jsonObject.get("credits")), Integer.parseInt((String) jsonObject.get("sortCode")), Integer.parseInt((String) jsonObject.get("securityNo")), Integer.parseInt((String) jsonObject.get("accountNum") )));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return accounts;
    }

}
