package tr.edu.metu.sm703;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SM703ExampleTest {

    private SM703Example sm703Example = new SM703Example();

    @Test
    public void checkEqualsForTwoNulls(){
        assertEquals(sm703Example.checkEquals(null, null), false);
    }

    @Test
    public void checkEqualsForNotEquals(){
        assertEquals(sm703Example.checkEquals(1, 2), false);
    }

    @Test
    public void checkEqualsForEquals(){
        assertEquals(sm703Example.checkEquals(2, 2), true);
    }

    @Test
    public void checkEqualsForZeroNullEquals(){
        assertEquals(sm703Example.checkEquals(0, null), false);
    }
}
