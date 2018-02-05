package core.entity.schema.json;

import core.entity.schema.EntitySchema;
import core.entity.schema.EntitySchemaSerializer;

public class JsonEntitySchemaSerializer implements EntitySchemaSerializer {
    private JsonObjectSerializer serializer;

    public JsonEntitySchemaSerializer(JsonObjectSerializer serializer) {
        this.serializer = serializer;
    }

    @Override
    public String toJson(EntitySchema schema) {
        return serializer.getJsonString(schema);
    }
}
