package stacks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StacksMainTest {

    @BeforeEach
    public void setUp(){

    }

    @Test
    void bracketBalanceTest(){
        String testString1 = "{}[]";
        String testString2 = "{}[";
        String testString3 = "{1+2]";
        String testString4 = "";

        assert Stacks.bracketBalance(testString1);
        assert !Stacks.bracketBalance(testString2);
        assert !Stacks.bracketBalance(testString3);
        assert Stacks.bracketBalance(testString4);
    }
}