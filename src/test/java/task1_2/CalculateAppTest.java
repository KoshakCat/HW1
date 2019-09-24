package task1_2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculateAppTest {

    private CalculateApp instance;

    @Before
    public void setUp () {
        instance = new CalculateApp();
    }

    @Test
    public void shouldReturnCorrectValue () {
        int number = 5;
        assertEquals(number * -1, instance.getResult(number));
    }


}