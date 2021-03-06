package core.entity.schema.serialization.json;

import core.entity.schema.EntitySchema;
import core.entity.schema.serialization.EntitySchemaSerializer;

public class JsonEntitySchemaSerializer implements EntitySchemaSerializer {
    private JsonObjectSerializer serializer;

    public JsonEntitySchemaSerializer(JsonObjectSerializer serializer) {
        this.serializer = serializer;
    }

    @Override
    public String toJson(EntitySchema schema) {
        return serializer.getJsonString(schema);
    }

    @Override
    public EntitySchema fromJson(String json) {
        return (EntitySchema)serializer.getObject(json, EntitySchema.class);
    }
}
