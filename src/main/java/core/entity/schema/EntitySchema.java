package core.entity.schema;

import java.util.Objects;
import java.util.Set;

public class EntitySchema{

    private String name;
    private Set<EntitySchemaProperty> properties;

    public EntitySchema(){}

    public EntitySchema(EntitySchemaBuilder builder){
        this.name = builder.getName();
        this.properties = builder.getProperties();
    }

    public String getName() {
        return name;
    }


    public Set<EntitySchemaProperty> getProperties() {
        return properties;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EntitySchema that = (EntitySchema) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(properties, that.properties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, properties);
    }
}