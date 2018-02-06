package core.entity.schema.serialization.json;

import core.entity.schema.EntitySchema;

public interface JsonObjectSerializer {
    public String getJsonString(Object o);
    Object getObject(String json, Class<EntitySchema> entitySchemaClass);
}
