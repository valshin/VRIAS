package core.entity.schema;

public interface EntitySchemaBuilder {
    String build();

    EntitySchemaBuilder name(String name);
}
