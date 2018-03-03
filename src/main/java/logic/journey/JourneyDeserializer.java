package logic.journey;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import logic.account.Account;

import java.io.IOException;

public class JourneyDeserializer extends StdDeserializer<Journey> {

    public JourneyDeserializer() {
        this(null);
    }

    public JourneyDeserializer(Class<Journey> t) {
        super(t);
    }

    @Override
    public Journey deserialize(JsonParser parser, DeserializationContext deserializer) {
        Journey journey = new Journey();
        ObjectCodec objectCodec = parser.getCodec();

        try {
            JsonNode jsonNode = objectCodec.readTree(parser);

            JsonNode idNode = jsonNode.get("id");

            System.out.println(idNode.asText());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return journey;
    }

}
