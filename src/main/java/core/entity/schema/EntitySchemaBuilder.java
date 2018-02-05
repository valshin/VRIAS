package core.entity.schema;

import java.util.Set;

public interface EntitySchemaBuilder {
    EntitySchema build();

    EntitySchemaBuilder setName(String name);

    String getName();

    EntitySchemaBuilder setProperties(Set<EntitySchemaProperty> properties);

    Set<EntitySchemaProperty> getProperties();
}
