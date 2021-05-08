package stacks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StacksMainTest {

    Stacks simpleTestStack;
    Stacks complexTestStack;

    @BeforeEach
    public void setUp(){
        simpleTestStack = new Stacks();
        complexTestStack = new Stacks();
    }
    @Test
    void validBalanceExpressionsTest() {
        String testString1 = "{}";
        String testString2 = "{{}";
        String testString3 = "{";
        assert simpleTestStack.simpleBalanceExpressions(testString1);
        assert !simpleTestStack.simpleBalanceExpressions(testString2);
        assert !simpleTestStack.simpleBalanceExpressions(testString3);
    }

    @Test
    void balanceExpressionsTest(){
        String testString1 = "{}[]";
        String testString2 = "{}[";
        String testString3 = "{1+2]";
        String testString4 = "";

        assert complexTestStack.balanceExpressions(testString1);
        assert !complexTestStack.balanceExpressions(testString2);
        assert !complexTestStack.balanceExpressions(testString3);
        assert complexTestStack.balanceExpressions(testString4);
    }
}