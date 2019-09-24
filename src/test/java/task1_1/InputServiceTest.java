package task1_1;

import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.ls.LSOutput;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import static org.junit.Assert.*;

public class InputServiceTest {

    private InputService instance;
    private ByteArrayInputStream in;
    private String testString;
    private String testStringExceptionCase;


    @Before
    public void setUp () {
        instance = new InputService();
        testString = "  some string  ";
        in = new ByteArrayInputStream(testString.getBytes());
        instance.scanner = new Scanner(in);
    }

    @Test
    public void shouldReturnNotNull () {
        assertNotNull(instance.getUserInput());
    }

    @Test
    public void shouldReturnStringWithoutSpace () {
        assertEquals(testString.trim(),instance.getUserInput());
    }

    @Test (expected = Exception.class)
    public void shouldReturnExceptionWhenInputEmptyString () {
        testStringExceptionCase = "";
        in = new ByteArrayInputStream(testStringExceptionCase.getBytes());
        instance.scanner = new Scanner(in);
        instance.getUserInput();
    }

}