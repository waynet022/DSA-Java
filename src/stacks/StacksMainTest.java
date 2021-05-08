package stacks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StacksMainTest {

    @BeforeEach
    public void setUp(){

    }


    @Test
    void balanceExpressionsTest(){
        String testString1 = "{}[]";
        String testString2 = "{}[";
        String testString3 = "{1+2]";
        String testString4 = "";

        assert Stacks.balanceExpressions(testString1);
        assert !Stacks.balanceExpressions(testString2);
        assert !Stacks.balanceExpressions(testString3);
        assert Stacks.balanceExpressions(testString4);
    }
}