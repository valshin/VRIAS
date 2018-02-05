package core.entity.schema;

import java.util.Set;

public class EntitySchemaBuilderImpl implements EntitySchemaBuilder {
    private String name;

    private Set<EntitySchemaProperty> properties;
    @Override
    public Set<EntitySchemaProperty> getProperties() {
        return properties;
    }

    @Override
    public EntitySchemaBuilder setProperties(Set<EntitySchemaProperty> properties) {
        this.properties = properties;
        return this;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public EntitySchemaBuilder setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public EntitySchema build() {
        EntitySchema es = new EntitySchema(this);
        clear();
        return es;
    }

    private void clear() {
        this.name = null;
    }
}
