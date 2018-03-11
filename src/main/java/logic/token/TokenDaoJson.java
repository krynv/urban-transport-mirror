package logic.token;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TokenDaoJson implements TokenDao {

    private static final String fileName = "./src/main/resources/token.json";

    public TokenDaoJson() {}

    public List<Token> getTokens() {
        ObjectMapper objectMapper = new ObjectMapper();

        List<Token> tokens = new ArrayList<Token>();

        try {
            tokens = objectMapper.readValue(new File(fileName), new TypeReference<List<Token>>() {});
        } catch (IOException e) {
            e.printStackTrace();
        }

        return tokens;
    }

}
