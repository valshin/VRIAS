package utilites;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

import static org.junit.Assert.*;

public class JsonAssert {

    private static ObjectMapper mapper = new ObjectMapper();

    public static void areEqual(String json1, String json2) {
        try {
            JsonNode node1 = mapper.readTree(json1);
            JsonNode node2 = mapper.readTree(json2);
            assertTrue(node1.equals(node2));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}