package stacks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StacksMainTest {

    Stacks testStack;

    @BeforeEach
    public void setUp(){
        testStack = new Stacks();
    }
    @Test
    void validBalanceExpressionsTest() {
        String testString1 = "{}";
        String testString2 = "{{}";
        String testString3 = "{";
        assert testStack.simpleBalanceExpressions(testString1);
        assert !testStack.simpleBalanceExpressions(testString2);
        assert !testStack.simpleBalanceExpressions(testString3);
    }
}