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
            jgen.writeNumberField("credits", account.getCredits());
            jgen.writeNumberField("sortCode", account.getSortCode());
            jgen.writeNumberField("securityNo", account.getSecurityNo());
            jgen.writeNumberField("accountNum", account.getAccountNum());
            jgen.writeEndObject();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
