package args;

import org.junit.jupiter.api.Test;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;
import static org.junit.jupiter.api.Assertions.*;

class MySchemaTest {
    @Test
    void test_create_schema_with_bool() throws Exception{
        MySchema schema = new MySchema("l:bool");
        assertNotNull(schema);
        assertNotNull(schema.getRule("l"));
        assertTrue((Boolean) schema.getRule("l").getValue("-l"));
        assertFalse((Boolean) schema.getRule("l").getValue(""));
    }

}