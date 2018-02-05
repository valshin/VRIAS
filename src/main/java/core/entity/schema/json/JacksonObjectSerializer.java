package core.entity.schema.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class JacksonObjectSerializer implements JsonObjectSerializer {
    private final ObjectMapper mapper = new ObjectMapper();

    public JacksonObjectSerializer() {
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
    }

    @Override
    public String getJsonString(Object o) {
        try {
            return mapper.writeValueAsString(o);
        } catch (IOException e) {
            throw new JsonSerializerException(e);
        }
    }

    private class JsonSerializerException extends RuntimeException {
        public JsonSerializerException(IOException e) {
            super(e);
        }
    }
}
