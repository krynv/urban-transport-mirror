package logic.account;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;

public class AccountDeserializer extends StdDeserializer<Account> {

    public AccountDeserializer() {
        this(null);
    }

    public AccountDeserializer(Class<Account> t) {
        super(t);
    }

    @Override
    public Account deserialize(JsonParser parser, DeserializationContext deserializer) {
        Account account = new Account();
        ObjectCodec objectCodec = parser.getCodec();

        try {
            JsonNode jsonNode = objectCodec.readTree(parser);
            JsonNode idNode = jsonNode.get("id");
            JsonNode nameNode = jsonNode.get("name");
            JsonNode creditsNode = jsonNode.get("credits");
            JsonNode sortCodeNode = jsonNode.get("sortCode");
            JsonNode securityNoNode = jsonNode.get("securityNo");
            JsonNode accountNumNode = jsonNode.get("accountNum");

            account.setId(idNode.asText());
            account.setName(nameNode.asText());
            account.setCredits(creditsNode.asDouble());
            account.setSortCode(sortCodeNode.asInt());
            account.setSecurityNo(securityNoNode.asInt());
            account.setAccountNum(accountNumNode.asInt());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return account;
    }
}
