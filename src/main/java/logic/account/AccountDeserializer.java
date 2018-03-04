package logic.account;

import com.fasterxml.jackson.core.JsonParser;
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

        try {
            JsonNode jsonNode = parser.getCodec().readTree(parser);
            JsonNode idNode = jsonNode.get("id");
            JsonNode nameNode = jsonNode.get("name");
            JsonNode creditsNode = jsonNode.get("credits");
            JsonNode sortCodeNode = jsonNode.get("sortCode");
            JsonNode securityNoNode = jsonNode.get("securityNo");
            JsonNode accountNumNode = jsonNode.get("accountNum");
            JsonNode spentTodayNode = jsonNode.get("spentToday");

            account.setId(idNode.asText());
            account.setName(nameNode.asText());
            account.setCredits(creditsNode.asDouble());
            account.setSortCode(sortCodeNode.asInt());
            account.setSecurityNo(securityNoNode.asInt());
            account.setAccountNum(accountNumNode.asInt());
            account.setSpentToday(spentTodayNode.asDouble());

//            if (!journeysNode.asText().equals("null")) {
//                for (JsonNode journeyNode: journeysNode.get("journeys")) {
//                    Journey journey = new Journey();
//
//                    journey.setDistance(journeyNode.get("distance").asDouble());
//                    journey.setDepartureLocation(new Location(journeyNode.get("departureLocation").get("id").asText()));
//                    journey.setArrivalLocation(new Location(journeyNode.get("arrivalLocation").get("id").asText()));
//                    journey.setDepartureDateTime(
//                            LocalDateTime.of(
//                                     journeyNode.get("departureDateTime").get("year").asInt(),
//                                     journeyNode.get("departureDateTime").get("monthValue").asInt(),
//                                     journeyNode.get("departureDateTime").get("dayOfMonth").asInt(),
//                                     journeyNode.get("departureDateTime").get("hour").asInt(),
//                                     journeyNode.get("departureDateTime").get("minute").asInt(),
//                                     journeyNode.get("departureDateTime").get("second").asInt()));
//
//                    account.addJourney(journey);
//                }
//            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return account;
    }
}
