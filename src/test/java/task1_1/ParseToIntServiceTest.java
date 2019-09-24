package task1_1;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

import static org.junit.Assert.*;

public class ParseToIntServiceTest {

    private ParseToIntService instance;
    private String test;
    private String testFaile;

    @Before
    public void setUp () {
        instance = new ParseToIntService();
        test = "100500";
        testFaile = "cdzxsc";
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