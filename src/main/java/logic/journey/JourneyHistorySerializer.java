package logic.journey;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

public class JourneyHistorySerializer extends StdSerializer<JourneyHistory> {

    public String accountId;

    public JourneyHistorySerializer() {
        this(null);
    }

    public JourneyHistorySerializer(Class<JourneyHistory> t) {
        super(t);
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    @Override
    public void serialize(JourneyHistory value, JsonGenerator jgen, SerializerProvider provider)throws IOException, JsonProcessingException {
        jgen.writeStartObject();
        jgen.writeStringField("accountId", accountId);
        jgen.writeEndObject();
    }
}
