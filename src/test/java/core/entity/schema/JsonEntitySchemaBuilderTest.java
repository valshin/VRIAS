package core.entity.schema;

import org.junit.Test;
import utilites.JsonAssert;

import static org.junit.Assert.*;

public class JsonEntitySchemaBuilderTest {
    @Test
    public void compile() {
        assertEquals(true, true);
    }

    @Test
    public void shouldReturnEmptyJson_whenNoDataPassed() {
        EntitySchemaBuilder esb = new JsonEntitySchemaBuilder();
        String result = esb.build();
        JsonAssert.areEqual(result, "{}");
    }

    @Test
    public void shouldReturnJsonWithName_whenNamePassed() {
        EntitySchemaBuilder esb = new JsonEntitySchemaBuilder();
        String result = esb.name("TestSchema").build();
        JsonAssert.areEqual(result, "{\"name\": \"TestSchema\"}");
    }
}
