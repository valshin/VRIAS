package core.entity.schema;

import java.util.Objects;

public class EntitySchemaProperty {
    private String name;
    private EntitySchemaPropertyType type;

    public String getName() {
        return name;
    }

    public EntitySchemaPropertyType getType() {
        return type;
    }

    public EntitySchemaProperty() {
    }

    public EntitySchemaProperty(String name, EntitySchemaPropertyType type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EntitySchemaProperty that = (EntitySchemaProperty) o;
        return Objects.equals(name, that.name) &&
                type == that.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type);
    }
}
