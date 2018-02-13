package logic.token;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TokenDaoJson {

    private static final String fileName = ".\\src\\main\\resources\\token.json";

    List<Token> tokens;

    public TokenDaoJson() {
        tokens = new ArrayList<Token>();
    }

    public List<Token> getTokens() {
        JSONParser jsonParser = new JSONParser();

        try {
            Object object = jsonParser.parse(new FileReader(fileName));
            JSONArray jsonArray = (JSONArray) object;

            for (int i = 0; i < jsonArray.size(); i++) {
                JSONObject jsonObject = (JSONObject) jsonArray.get(i);
                tokens.add(new Token((String) jsonObject.get("id"), (String) jsonObject.get("accountId")));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return tokens;
    }

}
