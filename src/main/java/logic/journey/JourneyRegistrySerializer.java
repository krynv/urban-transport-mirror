package logic.journey;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

public class JourneyRegistrySerializer extends StdSerializer<JourneyRegistry> {

    public String accountId;

    public JourneyRegistrySerializer() {
        this(null);
    }

    public JourneyRegistrySerializer(Class<JourneyRegistry> t) {
        super(t);
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    @Override
    public void serialize(JourneyRegistry value, JsonGenerator jgen, SerializerProvider provider)throws IOException, JsonProcessingException {
        jgen.writeStartObject();
        jgen.writeStringField("accountId", accountId);
        jgen.writeEndObject();
    }
}
