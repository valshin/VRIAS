package core.entity.schema.serialization;

import core.entity.schema.EntitySchema;

public interface EntitySchemaSerializer {
    String toJson(EntitySchema schema);
    EntitySchema fromJson(String json);
}
