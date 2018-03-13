package logic.account;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

public class AccountSerializer extends StdSerializer<Account> {

    public AccountSerializer() {
        this(null);
    }

    public AccountSerializer(Class<Account> t) {
        super(t);
    }

    @Override
    public void serialize(Account account, JsonGenerator jgen, SerializerProvider provider) {
        try {
            jgen.writeStartObject();
            jgen.writeStringField("id", account.getId());
            jgen.writeStringField("name", account.getName());
            jgen.writeNumberField("age", account.getAge());
            jgen.writeNumberField("credits", account.getCredits());
            jgen.writeNumberField("spentToday", account.getSpentToday());
            jgen.writeNumberField("sortCode", account.getSortCode());
            jgen.writeNumberField("securityNo", account.getSecurityNo());
            jgen.writeNumberField("accountNum", account.getAccountNum());

            if (account.getJourneys().getJourneys().size() != 0) {
                jgen.writeObjectField("journeys", account.getJourneys());
            }

            if (account.getPasses().getPasses().size() != 0) {
                jgen.writeObjectField("passes", account.getPasses());
            }

            jgen.writeEndObject();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}