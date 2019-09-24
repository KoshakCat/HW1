package task1_2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ParseToIntServiceTest {

    private ParseToIntService instance;
    private String test;
    private String testFaile;

    @Before
    public void setUp () {
        instance = new ParseToIntService();
        test = "100500";
        testFaile = "1cdzxsc12";
    }

    @Test
    public void shouldReturnCorrectNumber () {
        assertEquals(100500,instance.parseToIntValidString(test));
    }

    @Test (expected = Exception.class)
    public void shouldReturnException () {
        instance.parseToIntValidString(testFaile);
    }

}