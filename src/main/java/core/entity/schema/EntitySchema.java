package core.entity.schema;

import java.util.Set;

public class EntitySchema{

    private String name;
    private final Set<EntitySchemaProperty> properties;


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
}