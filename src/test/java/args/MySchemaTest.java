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
        assertFalse((Boolean) schema.getRule("l").getValue(""));
        assertFalse((Boolean) schema.getRule("l").getValue(null));
        assertTrue((Boolean) schema.getRule("l").getValue("True"));
    }
    @Test
    void test_create_schema_with_integer() throws Exception{
        MySchema schema = new MySchema("l:bool,d:int");
        assertNotNull(schema);
        assertNotNull(schema.getRule("d"));
        assertEquals(0,(Integer) schema.getRule("d").getValue(null));
        assertEquals(8080,(Integer) schema.getRule("d").getValue("8080"));
    }
    @Test
    void test_create_schema_with_Folder() throws Exception{
        MySchema schema = new MySchema("l:bool,d:int,f:string");
        assertNotNull(schema);
        assertNotNull(schema.getRule("f"));
        assertEquals(".",(String) schema.getRule("f").getValue(null));
        assertEquals("/user",(String) schema.getRule("f").getValue("/user"));
    }

}