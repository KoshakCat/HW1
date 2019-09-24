package task1_1;

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
        int number = 10101;
        int grade = 5;
        assertEquals(Integer.parseInt(Integer.toString(number),2),instance.getResult(number,grade));
    }

    @Test
    public void shouldReturnSameType () {
        int number = 10;
        int grade = 2;
        assertSame(Integer.valueOf(2),Integer.valueOf(instance.getResult(number,grade)));
    }



}