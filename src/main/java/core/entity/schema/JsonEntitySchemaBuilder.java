package core.entity.schema;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class JsonEntitySchemaBuilder implements EntitySchemaBuilder {
    private final ObjectMapper mapper;
    private EntitySchema entitySchema;

    public JsonEntitySchemaBuilder() {
        mapper = new ObjectMapper();
    }

    private EntitySchema getEntitySchema(){
        if (entitySchema == null){
            entitySchema = new EntitySchema();
        }
        return entitySchema;
    }

    private class EntitySchema{

        private String name;

        private void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }


    @Override
    public EntitySchemaBuilder name(String name) {
        getEntitySchema().setName(name);
        return this;
    }

    @Override
    public String build() {
        try {
            return mapper.writeValueAsString(getEntitySchema());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
