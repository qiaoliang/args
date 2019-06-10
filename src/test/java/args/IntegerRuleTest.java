package args;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IntegerRuleTest {
    @Test
    void test_getdefaultValue_with_integer() throws Exception {
        IntegerRule rule = new IntegerRule();
        assertEquals(0, rule.getValue(null));
    }
    @Test
    void test_getValue_with_integer() throws Exception {
        IntegerRule rule = new IntegerRule();
        assertEquals(8080, rule.getValue("8080"));
    }
}