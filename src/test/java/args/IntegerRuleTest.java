package args;

import org.junit.jupiter.api.Test;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;
import static org.junit.jupiter.api.Assertions.*;

class IntegerRuleTest {
@Test
void test_getValue_with_integer() throws Exception{
    IntegerRule rule = new IntegerRule();
    assertEquals(0,rule.getValue(""));
}

}