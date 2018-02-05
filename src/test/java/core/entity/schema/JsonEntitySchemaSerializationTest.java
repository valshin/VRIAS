package core.entity.schema;

import core.entity.schema.json.JacksonObjectSerializer;
import core.entity.schema.json.JsonEntitySchemaSerializer;
import org.junit.Before;
import org.junit.Test;
import utilites.JsonAssert;

import java.util.HashSet;
import java.util.Set;

public class JsonEntitySchemaSerializationTest {

    private EntitySchemaBuilderImpl esb;
    private JsonEntitySchemaSerializer ess;

    @Before
    public void setUp() {
        esb = new EntitySchemaBuilderImpl();
        ess = new JsonEntitySchemaSerializer(new JacksonObjectSerializer());
    }

    @Test
    public void shouldReturnEmptyJson_whenNoDataPassed() {
        EntitySchema schema = esb.build();
        JsonAssert.areEqual(ess.toJson(schema), "{}");
    }

    @Test
    public void shouldReturnJsonWithName_whenNamePassed() {
        EntitySchema schema = esb.setName("TestSchema").build();
        JsonAssert.areEqual(ess.toJson(schema), "{\"name\": \"TestSchema\"}");
    }

    @Test
    public void shouldReturnCorrectJson_whenAllFieldsPassed() {
        Set<EntitySchemaProperty> properties = new HashSet<>();
        properties.add(new EntitySchemaProperty("TestPropertyString", EntitySchemaPropertyType.STRING));
        properties.add(new EntitySchemaProperty("TestPropertyInteger", EntitySchemaPropertyType.INTEGER));
        EntitySchema schema = esb
                .setName("TestSchema")
                .setProperties(properties)
                .build();
        String resultJson = ess.toJson(schema);
        JsonAssert.areEqual(resultJson, "{\"name\": \"TestSchema\", \"properties\": [{\"name\":\"TestPropertyString\", \"type\":\"STRING\"}, {\"name\":\"TestPropertyInteger\", \"type\":\"INTEGER\"}]}");
    }
}
