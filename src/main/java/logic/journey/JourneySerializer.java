package logic.journey;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

public class JourneySerializer extends StdSerializer<JourneyRegistry> {

    public JourneySerializer() {
        this(null);
    }

    public JourneySerializer(Class<JourneyRegistry> t) {
        super(t);
    }

    @Override
    public void serialize(JourneyRegistry value, JsonGenerator jgen, SerializerProvider provider) {

    }
}
