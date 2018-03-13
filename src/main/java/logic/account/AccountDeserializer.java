package logic.account;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import logic.journey.Journey;
import logic.journey.JourneyRegistry;
import logic.location.Location;
import logic.pass.Pass;
import logic.pass.PassRegistry;

import java.io.IOException;
import java.time.LocalDateTime;

public class AccountDeserializer extends StdDeserializer<Account> {

    public AccountDeserializer() {
        this(null);
    }

    public AccountDeserializer(Class<Account> t) {
        super(t);
    }

    /**
     * Reads each object from JSON file
     * Sets the attributes of account class based on contents
     *
     * @param parser
     * @param deserializer
     * @return instance of account POJO
     */
    @Override
    public Account deserialize(JsonParser parser, DeserializationContext deserializer) {
        Account account = new Account();

        try {
            JsonNode jsonNode = parser.getCodec().readTree(parser);

            JsonNode idNode = jsonNode.get("id");
            JsonNode nameNode = jsonNode.get("name");
            JsonNode ageNode = jsonNode.get("age");
            JsonNode creditsNode = jsonNode.get("credits");
            JsonNode sortCodeNode = jsonNode.get("sortCode");
            JsonNode securityNoNode = jsonNode.get("securityNo");
            JsonNode accountNumNode = jsonNode.get("accountNum");
            JsonNode spentTodayNode = jsonNode.get("spentToday");

            JsonNode journeysRootNode = jsonNode.get("journeys");

            JourneyRegistry journeyRegistry = new JourneyRegistry();

            if (journeysRootNode != null) {
                JsonNode journeysNode = journeysRootNode.get("journeys");

                for (JsonNode journeyNode : journeysNode) {
                    Journey journey = new Journey();

                    JsonNode departureLocationNode = journeyNode.get("departureLocation");
                    JsonNode arrivalLocationNode = journeyNode.get("arrivalLocation");
                    JsonNode departureDateTimeNode = journeyNode.get("departureDateTime");
                    JsonNode arrivalDateTimeNode = journeyNode.get("arrivalDateTime");
                    JsonNode distanceNode = journeyNode.get("distance");

                    Location departureLocation = new Location();
                    Location arrivalLocation = new Location();
                    LocalDateTime departureLocalDateTime = null;
                    LocalDateTime arrivalLocalDateTime = null;
                    Double distance = 0.0;

                    if (!arrivalLocationNode.asText().equals("null")) {
                        arrivalLocation.setId(arrivalLocationNode.get("id").asText());
                        arrivalLocation.setName(arrivalLocationNode.get("name").asText());
                    }

                    if (!departureLocationNode.asText().equals("null")) {
                        departureLocation.setId(departureLocationNode.get("id").asText());
                        departureLocation.setName(departureLocationNode.get("name").asText());
                    }

                    if (!departureDateTimeNode.asText().equals("null")) {
                        departureLocalDateTime = LocalDateTime.of(
                                departureDateTimeNode.get("year").asInt(),
                                departureDateTimeNode.get("monthValue").asInt(),
                                departureDateTimeNode.get("dayOfMonth").asInt(),
                                departureDateTimeNode.get("hour").asInt(),
                                departureDateTimeNode.get("minute").asInt(),
                                departureDateTimeNode.get("second").asInt()
                        );
                    }

                    if (!arrivalDateTimeNode.asText().equals("null")) {
                        arrivalLocalDateTime = LocalDateTime.of(
                                arrivalDateTimeNode.get("year").asInt(),
                                arrivalDateTimeNode.get("monthValue").asInt(),
                                arrivalDateTimeNode.get("dayOfMonth").asInt(),
                                arrivalDateTimeNode.get("hour").asInt(),
                                arrivalDateTimeNode.get("minute").asInt(),
                                arrivalDateTimeNode.get("second").asInt()
                        );
                    }

                    if (!distanceNode.asText().equals("null")) {
                        distance = distanceNode.asDouble();
                    }

                    journey.setDistance(distance);
                    journey.setDepartureLocation(departureLocation);
                    journey.setDepartureDateTime(departureLocalDateTime);
                    journey.setArrivalLocation(arrivalLocation);
                    journey.setArrivalDateTime(arrivalLocalDateTime);

                    journeyRegistry.addJourney(journey);
                }
            }

            PassRegistry passRegistry = new PassRegistry();

            account.setId(idNode.asText());
            account.setName(nameNode.asText());
            account.setAge(ageNode.asInt());
            account.setCredits(creditsNode.asDouble());
            account.setSortCode(sortCodeNode.asInt());
            account.setSecurityNo(securityNoNode.asInt());
            account.setAccountNum(accountNumNode.asInt());
            account.setSpentToday(spentTodayNode.asDouble());
            account.setJourneys(journeyRegistry);
            account.setPasses(passRegistry);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return account;
    }
}
